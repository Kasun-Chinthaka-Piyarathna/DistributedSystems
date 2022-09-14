package org.kasun.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.zookeeper.KeeperException;
import org.kasun.communication.grpc.generated.AddInventoryServiceGrpc;
import org.kasun.communication.grpc.generated.StockOrderRequest;
import org.kasun.communication.grpc.generated.StockOrderResponse;
import org.kasun.synchronization.DistributedTxCoordinator;
import org.kasun.synchronization.DistributedTxListener;
import javafx.util.Pair;
import org.kasun.synchronization.DistributedTxParticipant;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class AddInventoryServiceImpl extends AddInventoryServiceGrpc.AddInventoryServiceImplBase
        implements DistributedTxListener {

    private ManagedChannel channel = null;
    AddInventoryServiceGrpc.AddInventoryServiceBlockingStub clientStub = null;
    private InventoryMgtServer server;
    private Pair<String, StockOrder> tempDataHolder;
    private boolean requestStatus = false;
    private int currentStockOrderId = 0;

    public AddInventoryServiceImpl(InventoryMgtServer server) {
        this.server = server;
    }

    @Override
    public void addStockOrder(StockOrderRequest request, StreamObserver<StockOrderResponse> responseObserver) {
        String stockSymbol = request.getStockSymbol();
        int quantity = request.getQuantity();
        double price = request.getPrice();
        String orderType = request.getOrderType();

        StockOrder stockOrder = new StockOrder(stockSymbol, quantity, price, orderType);
        String stockOrderId = getNextStockOrderId(stockOrder.getOrderType(), server.isLeader(), request.getIsSentByPrimary());

        if (server.isLeader()){
            try {
                System.out.println("Adding a stock order as Primary");
                startDistributedTx(stockOrderId, stockOrder);
                updateSecondaryServers(stockOrder);
                System.out.println("Start adding order");
                if (quantity > 0){
                    ((DistributedTxCoordinator)server.getAddStockOrderTx()).perform();
                } else {
                    ((DistributedTxCoordinator)server.getAddStockOrderTx()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while adding the order" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            if (request.getIsSentByPrimary()) {
                System.out.println("Updating secondary stock order book, on Primary's command");
                startDistributedTx(stockOrderId, stockOrder);
                if (quantity > 0) {
                    ((DistributedTxParticipant)server.getAddStockOrderTx()).voteCommit();
                } else {
                    ((DistributedTxParticipant)server.getAddStockOrderTx()).voteAbort();
                }
            } else {
                StockOrderResponse response = callPrimary(stockOrder);
                if (response.getRequestStatus()) {
                    requestStatus = true;
                }
            }
        }

        StockOrderResponse response = StockOrderResponse
                .newBuilder()
                .setRequestStatus(requestStatus)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String getNextStockOrderId(OrderType orderType, boolean isLeader, boolean isSentByPrimary) {
        if (isLeader || isSentByPrimary) {
            currentStockOrderId++;
        }
        return orderType.toString() + "-" + (currentStockOrderId);
    }

    private void startDistributedTx(String id, StockOrder stockOrder) {
        try {
            server.getAddStockOrderTx().start(id, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new Pair<>(id, stockOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateSecondaryServers(StockOrder stockOrder) throws KeeperException, InterruptedException {
        System.out.println("Updating secondary servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(stockOrder, true, IPAddress, port);
        }
    }

    private StockOrderResponse callPrimary(StockOrder stockOrder) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(stockOrder, false, IPAddress, port);
    }

    private StockOrderResponse callServer(StockOrder order, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = AddInventoryServiceGrpc.newBlockingStub(channel);

        StockOrderRequest request = StockOrderRequest
                .newBuilder()
                .setStockSymbol(order.getStockSymbol())
                .setQuantity(order.getQuantity())
                .setPrice(order.getPrice())
                .setOrderType(order.getOrderType().toString())
                .setIsSentByPrimary(isSentByPrimary)
                .build();

        return clientStub.addStockOrder(request);
    }

    @Override
    public void onGlobalCommit() {
        updateStockOrderBook();
        requestStatus = true;
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        requestStatus = false;
        System.out.println("Transaction Aborted by the Coordinator");
    }

    private void updateStockOrderBook() {
        if (tempDataHolder != null) {
            server.addStockOrder(tempDataHolder.getKey(), tempDataHolder.getValue());
            String addStockOrderMessage = "A stock order was added.\n" +
                    "Stock Order id: " + tempDataHolder.getKey() + "\n" +
                    "Stock Order type: " + tempDataHolder.getValue().getOrderType().toString() + "\n" +
                    "Stock Order symbol: " + tempDataHolder.getValue().getStockSymbol() + "\n" +
                    "Stock Order price: " + tempDataHolder.getValue().getPrice() + "\n" +
                    "Stock Order quantity: " + tempDataHolder.getValue().getQuantity() + "\n";
            System.out.println(addStockOrderMessage);
            tempDataHolder = null;
        }
    }
}
