package org.kasun.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.kasun.communication.grpc.generated.*;

import java.util.Scanner;

public class UpdateInventoryServiceClient {
    private ManagedChannel channel = null;
    UpdateInventoryServiceGrpc.UpdateInventoryServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public UpdateInventoryServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initConnection() {
        System.out.println("Initializing server connection at " + host + ":" + port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = UpdateInventoryServiceGrpc.newBlockingStub(channel);
    }

    public void processUserRequests() throws InterruptedException {
        System.out.println("Please enter details to update your stock order.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock order id : ");
        String stockOrderId = sc.next();
        System.out.println("Enter stock order type: [UPDATE/PLACE_ORDER]");
        String orderType = sc.next();
        System.out.println("Enter stock order symbol:");
        String stockSymbol = sc.next();
        System.out.println("Enter stock order quantity: ");
        int quantity = Integer.parseInt(sc.next());
        System.out.println("Enter stock order price:");
        double price = Double.parseDouble(sc.next());

        System.out.println("Are you sure you want to update order" + stockOrderId + " with below details? [Y/N]");
        System.out.println("Type:" + orderType);
        System.out.println("Stock symbol:" + stockSymbol);
        System.out.println("Quantity:" + quantity);
        System.out.println("Price:" + price);
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            StockOrderRequest stockOrderRequest = StockOrderRequest
                    .newBuilder()
                    .setStockSymbol(stockSymbol)
                    .setQuantity(quantity)
                    .setPrice(price)
                    .setOrderType(orderType)
                    .setIsSentByPrimary(false)
                    .build();

            UpdateStockOrderRequest request = UpdateStockOrderRequest
                    .newBuilder()
                    .setStockOrderRequest(stockOrderRequest)
                    .setOrderId(stockOrderId)
                    .build();

            StockOrderResponse response = clientStub.updateStockOrder(request);
            if (response.getRequestStatus()) {
                System.out.println("Updated stock order successfully");
            } else {
                System.out.println("Failed to update stock order");
            }
            Thread.sleep(1000);
        }
    }

    public void closeConnection() {
        channel.shutdown();
    }
}
