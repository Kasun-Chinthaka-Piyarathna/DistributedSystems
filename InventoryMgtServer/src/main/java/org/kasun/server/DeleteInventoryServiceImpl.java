package org.kasun.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.zookeeper.KeeperException;
import org.kasun.communication.grpc.generated.*;
import org.kasun.synchronization.DistributedTxCoordinator;
import org.kasun.synchronization.DistributedTxListener;
import org.kasun.synchronization.DistributedTxParticipant;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class DeleteInventoryServiceImpl extends DeleteInventoryServiceGrpc.DeleteInventoryServiceImplBase
        implements DistributedTxListener {

    private ManagedChannel channel = null;
    DeleteInventoryServiceGrpc.DeleteInventoryServiceBlockingStub clientStub = null;
    private InventoryMgtServer server;
    private String tempDataHolder;
    private boolean requestStatus = false;

    public DeleteInventoryServiceImpl(InventoryMgtServer server) {
        this.server = server;
    }

    @Override
    public void deleteStockOrder(DeleteStockOrderRequest request, StreamObserver<StockOrderResponse> responseObserver) {
        String stockOrderId = request.getOrderId();

        if (server.isLeader()) {
            try {
                System.out.println("Deleting a stock order as Primary");
                startDistributedTx(stockOrderId);
                updateSecondaryServers(stockOrderId);
                System.out.println("Start deleting order");
                if (stockOrderId != null){
                    ((DistributedTxCoordinator)server.getDeleteStockOrderTx()).perform();
                } else {
                    ((DistributedTxCoordinator)server.getUpdateStockOrderTx()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while deleting the order" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            if (request.getIsSentByPrimary()) {
                System.out.println("Deleting secondary stock order book, on Primary's command");
                startDistributedTx(stockOrderId);
                if (stockOrderId != null) {
                    ((DistributedTxParticipant)server.getUpdateStockOrderTx()).voteCommit();
                } else {
                    ((DistributedTxParticipant)server.getUpdateStockOrderTx()).voteAbort();
                }
            } else {
                StockOrderResponse response = callPrimary(stockOrderId);
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

    private void startDistributedTx(String stockOrderId) {
        try {
            server.getDeleteStockOrderTx().start(stockOrderId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = stockOrderId;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateSecondaryServers(String stockOrderId) throws KeeperException, InterruptedException {
        System.out.println("Deleting secondary servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(stockOrderId, true, IPAddress, port);
        }
    }

    private StockOrderResponse callPrimary(String stockOrderId) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(stockOrderId, false, IPAddress, port);
    }

    private StockOrderResponse callServer(String stockOrderId, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = DeleteInventoryServiceGrpc.newBlockingStub(channel);

        DeleteStockOrderRequest request = DeleteStockOrderRequest
                .newBuilder()
                .setOrderId(stockOrderId)
                .setIsSentByPrimary(isSentByPrimary)
                .build();

        return clientStub.deleteStockOrder(request);
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
            server.deleteStockOrder(tempDataHolder);
            tempDataHolder = null;
        }
    }
}
