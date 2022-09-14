package org.kasun.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.zookeeper.KeeperException;
import org.kasun.synchronization.DistributedLock;
import org.kasun.synchronization.DistributedTx;
import org.kasun.synchronization.DistributedTxCoordinator;
import org.kasun.synchronization.DistributedTxParticipant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class InventoryMgtServer {
    private DistributedLock leaderLock;
    private AtomicBoolean isLeader = new AtomicBoolean(false);
    private byte[] leaderData;
    private int serverPort;
    private Map<String, StockOrder> stockOrderBook = new HashMap<>();

    DistributedTx addStockOrderTx;
    AddInventoryServiceImpl AddInventoryService;
    DistributedTx updateStockOrderTx;
    UpdateInventoryServiceImpl UpdateInventoryService;
    DistributedTx deleteStockOrderTx;
    DeleteInventoryServiceImpl DeleteInventoryService;

    public InventoryMgtServer(String host, int port) throws InterruptedException, IOException, KeeperException {
        this.serverPort = port;
        leaderLock = new DistributedLock("InventoryMgtServerCluster", buildServerData(host, port));
        AddInventoryService = new AddInventoryServiceImpl(this);
        UpdateInventoryService = new UpdateInventoryServiceImpl(this);
        DeleteInventoryService = new DeleteInventoryServiceImpl(this);
        addStockOrderTx = new DistributedTxParticipant(AddInventoryService);
        updateStockOrderTx = new DistributedTxParticipant(UpdateInventoryService);
        deleteStockOrderTx = new DistributedTxParticipant(DeleteInventoryService);
    }

    public static String buildServerData(String IP, int port) {
        StringBuilder builder = new StringBuilder();
        builder.append(IP).append(":").append(port);
        return builder.toString();
    }

    public static void main (String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("Usage executable-name <port>");
        }

        int serverPort = Integer.parseInt(args[0]);
        DistributedLock.setZooKeeperURL("localhost:2181");
        DistributedTx.setZooKeeperURL("localhost:2181");

        InventoryMgtServer server = new InventoryMgtServer("localhost", serverPort);
        server.startServer();
    }

    public void startServer() throws IOException, InterruptedException, KeeperException {
        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(AddInventoryService)
                .addService(UpdateInventoryService)
                .addService(DeleteInventoryService)
                .build();
        server.start();
        System.out.println("InventoryMgtServer Started on port " + serverPort);
        tryToBeLeader();
        server.awaitTermination();
    }

    private void tryToBeLeader() throws KeeperException, InterruptedException {
        Thread leaderCampaignThread = new Thread(new LeaderCampaignThread());
        leaderCampaignThread.start();
    }

    class LeaderCampaignThread implements Runnable {
        private byte[] currentLeaderData = null;

        @Override
        public void run() {
            System.out.println("Starting the leader Campaign");

            try {
                boolean leader = leaderLock.tryAcquireLock();

                while (!leader) {
                    byte[] leaderData = leaderLock.getLockHolderData();
                    if (currentLeaderData != leaderData) {
                        currentLeaderData = leaderData;
                        setCurrentLeaderData(currentLeaderData);
                    }
                    Thread.sleep(10000);
                    leader = leaderLock.tryAcquireLock();
                }
                System.out.println("I got the leader lock. Now acting as primary");
                isLeader.set(true);
                currentLeaderData = null;
                beTheLeader();
            } catch (Exception e){
                System.out.println("Error while leader campaign");
            }
        }
    }

    private void beTheLeader() {
        System.out.println("I got the leader lock. Now acting as primary");
        isLeader.set(true);
        addStockOrderTx = new DistributedTxCoordinator(AddInventoryService);
        updateStockOrderTx = new DistributedTxCoordinator(UpdateInventoryService);
        deleteStockOrderTx = new DistributedTxCoordinator(DeleteInventoryService);
    }

    public List<String[]> getOthersData() throws KeeperException, InterruptedException {
        List<String[]> result = new ArrayList<>();
        List<byte[]> othersData = leaderLock.getOthersData();

        for (byte[] data : othersData) {
            String[] dataStrings = new String(data).split(":");
            result.add(dataStrings);
        }
        return result;
    }

    private synchronized void setCurrentLeaderData(byte[] leaderData) {
        this.leaderData = leaderData;
    }

    public synchronized String[] getCurrentLeaderData() {
        return new String(leaderData).split(":");
    }

    public boolean isLeader() {
        return isLeader.get();
    }

    public void addStockOrder(String stockOrderId, StockOrder stockOrder) {
        stockOrderBook.put(stockOrderId, stockOrder);
        matchStockOrders(stockOrderId, stockOrder);
    }

    public void updateStockOrder(String stockOrderId, StockOrder stockOrder) {
        StockOrder matchingStockOrder = stockOrderBook.get(stockOrderId);

        if(matchingStockOrder != null){
            matchingStockOrder.setStockSymbol(stockOrder.getStockSymbol());
            matchingStockOrder.setQuantity(stockOrder.getQuantity());
            matchingStockOrder.setPrice(stockOrder.getPrice());
            matchingStockOrder.setOrderType(stockOrder.getOrderType());

            matchStockOrders(stockOrderId, matchingStockOrder);
            String updateStockOrderMessage = "A stock order was updated.\n" +
                    "Stock Order id: " + stockOrderId + "\n" +
                    "Stock Order type: " + stockOrder.getOrderType().toString() + "\n" +
                    "Stock Order symbol: " + stockOrder.getStockSymbol() + "\n" +
                    "Stock Order price: " + stockOrder.getPrice() + "\n" +
                    "Stock Order quantity: " + stockOrder.getQuantity() + "\n";
            System.out.println(updateStockOrderMessage);
        }else {
            System.out.println("There is no stock order with given id");
        }
    }

    public void deleteStockOrder(String stockOrderId){
        if(stockOrderBook.containsKey(stockOrderId)) {
            stockOrderBook.remove(stockOrderId);
            String deleteStockOrderMessage = "A stock order was deleted.\n" +
                    "Stock Order id: " + stockOrderId + "\n";
            System.out.println(deleteStockOrderMessage);
        } else {
            System.out.println("There is no stock order with given id");
        }
    }

    private void matchStockOrders(String stockOrderId, StockOrder stockOrder){
        String match = null;
        for(Map.Entry<String, StockOrder> entry : stockOrderBook.entrySet()) {
            StockOrder so = entry.getValue();
            if (so.getQuantity() == stockOrder.getQuantity() && so.getPrice() == stockOrder.getPrice() &&
                    !so.getOrderType().equals(stockOrder.getOrderType())) {
                match = entry.getKey();
            }
        }

        if(match != null){
            stockOrderBook.remove(stockOrderId);
            stockOrderBook.remove(match);
            System.out.println("Matching order found.");
        }else {
            System.out.println("Matching order not found. Please wait until a matching order received");
        }
    }

    public DistributedTx getAddStockOrderTx() {
        return addStockOrderTx;
    }

    public DistributedTx getUpdateStockOrderTx() {
        return updateStockOrderTx;
    }

    public DistributedTx getDeleteStockOrderTx() {
        return deleteStockOrderTx;
    }
}
