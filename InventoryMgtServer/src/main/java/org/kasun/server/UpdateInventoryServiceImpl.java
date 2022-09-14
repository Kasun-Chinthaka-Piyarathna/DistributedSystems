package org.kasun.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.util.Pair;
import org.apache.zookeeper.KeeperException;
import org.kasun.communication.grpc.generated.*;
import org.kasun.synchronization.DistributedTxCoordinator;
import org.kasun.synchronization.DistributedTxListener;
import org.kasun.synchronization.DistributedTxParticipant;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class UpdateInventoryServiceImpl extends UpdateInventoryServiceGrpc.UpdateInventoryServiceImplBase
        implements DistributedTxListener {

    private ManagedChannel channel = null;
    UpdateInventoryServiceGrpc.UpdateInventoryServiceBlockingStub clientStub = null;
    private InventoryMgtServer server;
    private Pair<String, StockOrder> tempDataHolder;
    private boolean requestStatus = false;

    public UpdateInventoryServiceImpl(InventoryMgtServer server) {
        this.server = server;
    }

    @Override
    public void updateStockOrder(UpdateStockOrderRequest request, StreamObserver<StockOrderResponse> responseObserver) {
        String stockSymbol = request.getStockOrderRequest().getStockSymbol();
        int quantity = request.getStockOrderRequest().getQuantity();
        double price = request.getStockOrderRequest().getPrice();
        String orderType = request.getStockOrderRequest().getOrderType();
        String stockOrderId = request.getOrderId();

        StockOrder stockOrder = new StockOrder(stockSymbol, quantity, price, orderType);

        if (server.isLeader()) {
            try {
                System.out.println("Updating a stock order as Primary");
                startDistributedTx(stockOrderId, stockOrder);
                updateSecondaryServers(stockOrderId, stockOrder);
                System.out.println("Start updating order");
                if (quantity > 0){
                    ((DistributedTxCoordinator)server.getUpdateStockOrderTx()).perform();
                } else {
                    ((DistributedTxCoordinator)server.getUpdateStockOrderTx()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while updating the order" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            if (request.getStockOrderRequest().getIsSentByPrimary()) {
                System.out.println("Updating secondary stock order book, on Primary's command");
                startDistributedTx(stockOrderId, stockOrder);
                if (quantity > 0) {
                    ((DistributedTxParticipant)server.getUpdateStockOrderTx()).voteCommit();
                } else {
                    ((DistributedTxParticipant)server.getUpdateStockOrderTx()).voteAbort();
                }
            } else {
                StockOrderResponse response = callPrimary(stockOrderId, stockOrder);
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

    private void startDistributedTx(String stockOrderId, StockOrder stockOrder) {
        try {
            server.getUpdateStockOrderTx().start(stockOrderId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new Pair<>(stockOrderId, stockOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateSecondaryServers(String stockOrderId, StockOrder stockOrder) throws KeeperException, InterruptedException {
        System.out.println("Updating secondary servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(stockOrderId, stockOrder, true, IPAddress, port);
        }
    }

    private StockOrderResponse callPrimary(String stockOrderId, StockOrder stockOrder) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(stockOrderId, stockOrder, false, IPAddress, port);
    }

    private StockOrderResponse callServer(String stockOrderId, StockOrder order, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = UpdateInventoryServiceGrpc.newBlockingStub(channel);

        StockOrderRequest stockOrderRequest = StockOrderRequest
                .newBuilder()
                .setStockSymbol(order.getStockSymbol())
                .setQuantity(order.getQuantity())
                .setPrice(order.getPrice())
                .setOrderType(order.getOrderType().toString())
                .setIsSentByPrimary(isSentByPrimary)
                .build();

        UpdateStockOrderRequest request = UpdateStockOrderRequest
                .newBuilder()
                .setStockOrderRequest(stockOrderRequest)
                .setOrderId(stockOrderId)
                .build();

        return clientStub.updateStockOrder(request);
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
            server.updateStockOrder(tempDataHolder.getKey(), tempDataHolder.getValue());
            tempDataHolder = null;
        }
    }
}
