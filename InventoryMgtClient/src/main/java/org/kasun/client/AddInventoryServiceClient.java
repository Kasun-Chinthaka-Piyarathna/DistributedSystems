package org.kasun.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.kasun.communication.grpc.generated.AddInventoryServiceGrpc;
import org.kasun.communication.grpc.generated.StockOrderRequest;
import org.kasun.communication.grpc.generated.StockOrderResponse;

import java.util.Scanner;

public class AddInventoryServiceClient {
    private ManagedChannel channel = null;
    AddInventoryServiceGrpc.AddInventoryServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public AddInventoryServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initConnection() {
        System.out.println("Initializing server connection at " + host + ":" + port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = AddInventoryServiceGrpc.newBlockingStub(channel);
    }

    public void processUserRequests() throws InterruptedException {
        System.out.println("Please enter details for your stock order.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock order type: [UPDATE/PLACE_ORDER]");
        String orderType = sc.next();
        System.out.println("Enter stock order symbol:");
        String stockSymbol = sc.next();
        System.out.println("Enter stock order quantity: ");
        int quantity = Integer.parseInt(sc.next());
        System.out.println("Enter stock order price:");
        double price = Double.parseDouble(sc.next());

        System.out.println("Are you sure you want to add below stock order? [Y/N]");
        System.out.println("Type:" + orderType);
        System.out.println("Stock symbol:" + stockSymbol);
        System.out.println("Quantity:" + quantity);
        System.out.println("Price:" + price);
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            StockOrderRequest request = StockOrderRequest
                    .newBuilder()
                    .setStockSymbol(stockSymbol)
                    .setQuantity(quantity)
                    .setPrice(price)
                    .setOrderType(orderType)
                    .setIsSentByPrimary(false)
                    .build();

            StockOrderResponse response = clientStub.addStockOrder(request);
            if (response.getRequestStatus()) {
                System.out.println("Added stock order successfully");
            } else {
                System.out.println("Failed to add stock order");
            }
            Thread.sleep(1000);
        }
    }

    public void closeConnection() {
        channel.shutdown();
    }
}
