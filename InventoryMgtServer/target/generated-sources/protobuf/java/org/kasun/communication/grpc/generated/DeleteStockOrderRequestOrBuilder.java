// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTradingSystem.proto

package org.kasun.communication.grpc.generated;

public interface DeleteStockOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.kasun.communication.grpc.generated.DeleteStockOrderRequest)
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
   * <code>bool isSentByPrimary = 2;</code>
   * @return The isSentByPrimary.
   */
  boolean getIsSentByPrimary();
}