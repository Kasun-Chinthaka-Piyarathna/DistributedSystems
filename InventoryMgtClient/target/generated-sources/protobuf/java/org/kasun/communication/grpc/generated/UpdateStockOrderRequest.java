// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTradingSystem.proto

package org.kasun.communication.grpc.generated;

/**
 * Protobuf type {@code org.kasun.communication.grpc.generated.UpdateStockOrderRequest}
 */
public final class UpdateStockOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.kasun.communication.grpc.generated.UpdateStockOrderRequest)
    UpdateStockOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateStockOrderRequest.newBuilder() to construct.
  private UpdateStockOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateStockOrderRequest() {
    orderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateStockOrderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateStockOrderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderId_ = s;
            break;
          }
          case 18: {
            org.kasun.communication.grpc.generated.StockOrderRequest.Builder subBuilder = null;
            if (stockOrderRequest_ != null) {
              subBuilder = stockOrderRequest_.toBuilder();
            }
            stockOrderRequest_ = input.readMessage(org.kasun.communication.grpc.generated.StockOrderRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stockOrderRequest_);
              stockOrderRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_UpdateStockOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_UpdateStockOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.kasun.communication.grpc.generated.UpdateStockOrderRequest.class, org.kasun.communication.grpc.generated.UpdateStockOrderRequest.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string orderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string orderId = 1;</code>
   * @return The bytes for orderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOCKORDERREQUEST_FIELD_NUMBER = 2;
  private org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest_;
  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   * @return Whether the stockOrderRequest field is set.
   */
  @java.lang.Override
  public boolean hasStockOrderRequest() {
    return stockOrderRequest_ != null;
  }
  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   * @return The stockOrderRequest.
   */
  @java.lang.Override
  public org.kasun.communication.grpc.generated.StockOrderRequest getStockOrderRequest() {
    return stockOrderRequest_ == null ? org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance() : stockOrderRequest_;
  }
  /**
   * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
   */
  @java.lang.Override
  public org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder getStockOrderRequestOrBuilder() {
    return getStockOrderRequest();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (stockOrderRequest_ != null) {
      output.writeMessage(2, getStockOrderRequest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (stockOrderRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStockOrderRequest());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.kasun.communication.grpc.generated.UpdateStockOrderRequest)) {
      return super.equals(obj);
    }
    org.kasun.communication.grpc.generated.UpdateStockOrderRequest other = (org.kasun.communication.grpc.generated.UpdateStockOrderRequest) obj;

    if (!getOrderId()
        .equals(other.getOrderId())) return false;
    if (hasStockOrderRequest() != other.hasStockOrderRequest()) return false;
    if (hasStockOrderRequest()) {
      if (!getStockOrderRequest()
          .equals(other.getStockOrderRequest())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    if (hasStockOrderRequest()) {
      hash = (37 * hash) + STOCKORDERREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getStockOrderRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.kasun.communication.grpc.generated.UpdateStockOrderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.kasun.communication.grpc.generated.UpdateStockOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.kasun.communication.grpc.generated.UpdateStockOrderRequest)
      org.kasun.communication.grpc.generated.UpdateStockOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_UpdateStockOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_UpdateStockOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.kasun.communication.grpc.generated.UpdateStockOrderRequest.class, org.kasun.communication.grpc.generated.UpdateStockOrderRequest.Builder.class);
    }

    // Construct using org.kasun.communication.grpc.generated.UpdateStockOrderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderId_ = "";

      if (stockOrderRequestBuilder_ == null) {
        stockOrderRequest_ = null;
      } else {
        stockOrderRequest_ = null;
        stockOrderRequestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_UpdateStockOrderRequest_descriptor;
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.UpdateStockOrderRequest getDefaultInstanceForType() {
      return org.kasun.communication.grpc.generated.UpdateStockOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.UpdateStockOrderRequest build() {
      org.kasun.communication.grpc.generated.UpdateStockOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.UpdateStockOrderRequest buildPartial() {
      org.kasun.communication.grpc.generated.UpdateStockOrderRequest result = new org.kasun.communication.grpc.generated.UpdateStockOrderRequest(this);
      result.orderId_ = orderId_;
      if (stockOrderRequestBuilder_ == null) {
        result.stockOrderRequest_ = stockOrderRequest_;
      } else {
        result.stockOrderRequest_ = stockOrderRequestBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.kasun.communication.grpc.generated.UpdateStockOrderRequest) {
        return mergeFrom((org.kasun.communication.grpc.generated.UpdateStockOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.kasun.communication.grpc.generated.UpdateStockOrderRequest other) {
      if (other == org.kasun.communication.grpc.generated.UpdateStockOrderRequest.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (other.hasStockOrderRequest()) {
        mergeStockOrderRequest(other.getStockOrderRequest());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.kasun.communication.grpc.generated.UpdateStockOrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.kasun.communication.grpc.generated.UpdateStockOrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string orderId = 1;</code>
     * @return The orderId.
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     * @return The bytes for orderId.
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     * @param value The bytes for orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.kasun.communication.grpc.generated.StockOrderRequest, org.kasun.communication.grpc.generated.StockOrderRequest.Builder, org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder> stockOrderRequestBuilder_;
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     * @return Whether the stockOrderRequest field is set.
     */
    public boolean hasStockOrderRequest() {
      return stockOrderRequestBuilder_ != null || stockOrderRequest_ != null;
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     * @return The stockOrderRequest.
     */
    public org.kasun.communication.grpc.generated.StockOrderRequest getStockOrderRequest() {
      if (stockOrderRequestBuilder_ == null) {
        return stockOrderRequest_ == null ? org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance() : stockOrderRequest_;
      } else {
        return stockOrderRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public Builder setStockOrderRequest(org.kasun.communication.grpc.generated.StockOrderRequest value) {
      if (stockOrderRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stockOrderRequest_ = value;
        onChanged();
      } else {
        stockOrderRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public Builder setStockOrderRequest(
        org.kasun.communication.grpc.generated.StockOrderRequest.Builder builderForValue) {
      if (stockOrderRequestBuilder_ == null) {
        stockOrderRequest_ = builderForValue.build();
        onChanged();
      } else {
        stockOrderRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public Builder mergeStockOrderRequest(org.kasun.communication.grpc.generated.StockOrderRequest value) {
      if (stockOrderRequestBuilder_ == null) {
        if (stockOrderRequest_ != null) {
          stockOrderRequest_ =
            org.kasun.communication.grpc.generated.StockOrderRequest.newBuilder(stockOrderRequest_).mergeFrom(value).buildPartial();
        } else {
          stockOrderRequest_ = value;
        }
        onChanged();
      } else {
        stockOrderRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public Builder clearStockOrderRequest() {
      if (stockOrderRequestBuilder_ == null) {
        stockOrderRequest_ = null;
        onChanged();
      } else {
        stockOrderRequest_ = null;
        stockOrderRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public org.kasun.communication.grpc.generated.StockOrderRequest.Builder getStockOrderRequestBuilder() {
      
      onChanged();
      return getStockOrderRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    public org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder getStockOrderRequestOrBuilder() {
      if (stockOrderRequestBuilder_ != null) {
        return stockOrderRequestBuilder_.getMessageOrBuilder();
      } else {
        return stockOrderRequest_ == null ?
            org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance() : stockOrderRequest_;
      }
    }
    /**
     * <code>.org.kasun.communication.grpc.generated.StockOrderRequest stockOrderRequest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.kasun.communication.grpc.generated.StockOrderRequest, org.kasun.communication.grpc.generated.StockOrderRequest.Builder, org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder> 
        getStockOrderRequestFieldBuilder() {
      if (stockOrderRequestBuilder_ == null) {
        stockOrderRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.kasun.communication.grpc.generated.StockOrderRequest, org.kasun.communication.grpc.generated.StockOrderRequest.Builder, org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder>(
                getStockOrderRequest(),
                getParentForChildren(),
                isClean());
        stockOrderRequest_ = null;
      }
      return stockOrderRequestBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.kasun.communication.grpc.generated.UpdateStockOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:org.kasun.communication.grpc.generated.UpdateStockOrderRequest)
  private static final org.kasun.communication.grpc.generated.UpdateStockOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.kasun.communication.grpc.generated.UpdateStockOrderRequest();
  }

  public static org.kasun.communication.grpc.generated.UpdateStockOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateStockOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateStockOrderRequest>() {
    @java.lang.Override
    public UpdateStockOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateStockOrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateStockOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateStockOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.kasun.communication.grpc.generated.UpdateStockOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

