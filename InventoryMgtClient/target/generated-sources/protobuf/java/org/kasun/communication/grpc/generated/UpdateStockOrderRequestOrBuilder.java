// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryMgtSystem.proto

package org.kasun.communication.grpc.generated;

public interface UpdateStockOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.kasun.communication.grpc.generated.UpdateStockOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   * @return Whether the stockOrderRequest field is set.
   */
  boolean hasStockOrderRequest();
  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   * @return The stockOrderRequest.
   */
  org.kasun.communication.grpc.generated.StockOrderRequest getStockOrderRequest();
  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   */
  org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder getStockOrderRequestOrBuilder();
}
