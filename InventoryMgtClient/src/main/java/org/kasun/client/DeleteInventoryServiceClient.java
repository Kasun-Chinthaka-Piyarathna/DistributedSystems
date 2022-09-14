package org.kasun.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.kasun.communication.grpc.generated.*;

import java.util.Scanner;

public class DeleteInventoryServiceClient {
    private ManagedChannel channel = null;
    DeleteInventoryServiceGrpc.DeleteInventoryServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public DeleteInventoryServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initConnection() {
        System.out.println("Initializing server connection at " + host + ":" + port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = DeleteInventoryServiceGrpc.newBlockingStub(channel);
    }

    public void processUserRequests() throws InterruptedException {
        System.out.println("Please enter stock order id to delete.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock order id : ");
        String stockOrderId = sc.next();

        System.out.println("Are you sure you want to delete order" + stockOrderId + "? [Y/N]");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            DeleteStockOrderRequest request = DeleteStockOrderRequest
                    .newBuilder()
                    .setOrderId(stockOrderId)
                    .setIsSentByPrimary(false)
                    .build();

            StockOrderResponse response = clientStub.deleteStockOrder(request);
            if (response.getRequestStatus()) {
                System.out.println("Deleted stock order successfully");
            } else {
                System.out.println("Failed to delete stock order");
            }
            Thread.sleep(1000);
        }
    }

    public void closeConnection() {
        channel.shutdown();
    }
}
