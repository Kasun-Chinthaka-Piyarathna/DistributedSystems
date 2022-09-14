package org.kasun.client;

import java.util.Scanner;

public class InventoryMgtClient {
    public static void main(String[] args) throws InterruptedException {
        String host = args[0];
        int port = Integer.parseInt(args[1].trim());

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select your operation:");
            System.out.println("1. Add stock order");
            System.out.println("2. Update stock order");
            System.out.println("3. Delete stock order");
            System.out.println("0. Exit");

            String operation = sc.next();

            switch (operation){
                case "1":
                    AddInventoryServiceClient AddInventoryServiceClient = new AddInventoryServiceClient(host, port);
                    AddInventoryServiceClient.initConnection();
                    AddInventoryServiceClient.processUserRequests();
                    AddInventoryServiceClient.closeConnection();
                    break;
                case "2":
                    UpdateInventoryServiceClient UpdateInventoryServiceClient = new UpdateInventoryServiceClient(host, port);
                    UpdateInventoryServiceClient.initConnection();
                    UpdateInventoryServiceClient.processUserRequests();
                    UpdateInventoryServiceClient.closeConnection();
                    break;
                case "3":
                    DeleteInventoryServiceClient DeleteInventoryServiceClient = new DeleteInventoryServiceClient(host, port);
                    DeleteInventoryServiceClient.initConnection();
                    DeleteInventoryServiceClient.processUserRequests();
                    DeleteInventoryServiceClient.closeConnection();
                    break;
                default:
                    break;
            }
        }
    }
}
