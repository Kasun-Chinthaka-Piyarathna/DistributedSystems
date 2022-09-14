// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTradingSystem.proto

package org.kasun.communication.grpc.generated;

/**
 * Protobuf type {@code org.kasun.communication.grpc.generated.StockOrderRequest}
 */
public final class StockOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.kasun.communication.grpc.generated.StockOrderRequest)
    StockOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StockOrderRequest.newBuilder() to construct.
  private StockOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StockOrderRequest() {
    stockSymbol_ = "";
    orderType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StockOrderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StockOrderRequest(
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

            stockSymbol_ = s;
            break;
          }
          case 16: {

            quantity_ = input.readInt32();
            break;
          }
          case 25: {

            price_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            orderType_ = s;
            break;
          }
          case 40: {

            isSentByPrimary_ = input.readBool();
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
    return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_StockOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_StockOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.kasun.communication.grpc.generated.StockOrderRequest.class, org.kasun.communication.grpc.generated.StockOrderRequest.Builder.class);
  }

  public static final int STOCKSYMBOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object stockSymbol_;
  /**
   * <code>string stockSymbol = 1;</code>
   * @return The stockSymbol.
   */
  @java.lang.Override
  public java.lang.String getStockSymbol() {
    java.lang.Object ref = stockSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stockSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>string stockSymbol = 1;</code>
   * @return The bytes for stockSymbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStockSymbolBytes() {
    java.lang.Object ref = stockSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stockSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private double price_;
  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public double getPrice() {
    return price_;
  }

  public static final int ORDERTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object orderType_;
  /**
   * <code>string orderType = 4;</code>
   * @return The orderType.
   */
  @java.lang.Override
  public java.lang.String getOrderType() {
    java.lang.Object ref = orderType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderType_ = s;
      return s;
    }
  }
  /**
   * <code>string orderType = 4;</code>
   * @return The bytes for orderType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderTypeBytes() {
    java.lang.Object ref = orderType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSENTBYPRIMARY_FIELD_NUMBER = 5;
  private boolean isSentByPrimary_;
  /**
   * <code>bool isSentByPrimary = 5;</code>
   * @return The isSentByPrimary.
   */
  @java.lang.Override
  public boolean getIsSentByPrimary() {
    return isSentByPrimary_;
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
    if (!getStockSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stockSymbol_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    if (price_ != 0D) {
      output.writeDouble(3, price_);
    }
    if (!getOrderTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, orderType_);
    }
    if (isSentByPrimary_ != false) {
      output.writeBool(5, isSentByPrimary_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStockSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stockSymbol_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, price_);
    }
    if (!getOrderTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, orderType_);
    }
    if (isSentByPrimary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isSentByPrimary_);
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
    if (!(obj instanceof org.kasun.communication.grpc.generated.StockOrderRequest)) {
      return super.equals(obj);
    }
    org.kasun.communication.grpc.generated.StockOrderRequest other = (org.kasun.communication.grpc.generated.StockOrderRequest) obj;

    if (!getStockSymbol()
        .equals(other.getStockSymbol())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (!getOrderType()
        .equals(other.getOrderType())) return false;
    if (getIsSentByPrimary()
        != other.getIsSentByPrimary()) return false;
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
    hash = (37 * hash) + STOCKSYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getStockSymbol().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + ORDERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getOrderType().hashCode();
    hash = (37 * hash) + ISSENTBYPRIMARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSentByPrimary());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.kasun.communication.grpc.generated.StockOrderRequest parseFrom(
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
  public static Builder newBuilder(org.kasun.communication.grpc.generated.StockOrderRequest prototype) {
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
   * Protobuf type {@code org.kasun.communication.grpc.generated.StockOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.kasun.communication.grpc.generated.StockOrderRequest)
      org.kasun.communication.grpc.generated.StockOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_StockOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_StockOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.kasun.communication.grpc.generated.StockOrderRequest.class, org.kasun.communication.grpc.generated.StockOrderRequest.Builder.class);
    }

    // Construct using org.kasun.communication.grpc.generated.StockOrderRequest.newBuilder()
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
      stockSymbol_ = "";

      quantity_ = 0;

      price_ = 0D;

      orderType_ = "";

      isSentByPrimary_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.internal_static_org_kasun_communication_grpc_generated_StockOrderRequest_descriptor;
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.StockOrderRequest getDefaultInstanceForType() {
      return org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.StockOrderRequest build() {
      org.kasun.communication.grpc.generated.StockOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.kasun.communication.grpc.generated.StockOrderRequest buildPartial() {
      org.kasun.communication.grpc.generated.StockOrderRequest result = new org.kasun.communication.grpc.generated.StockOrderRequest(this);
      result.stockSymbol_ = stockSymbol_;
      result.quantity_ = quantity_;
      result.price_ = price_;
      result.orderType_ = orderType_;
      result.isSentByPrimary_ = isSentByPrimary_;
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
      if (other instanceof org.kasun.communication.grpc.generated.StockOrderRequest) {
        return mergeFrom((org.kasun.communication.grpc.generated.StockOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.kasun.communication.grpc.generated.StockOrderRequest other) {
      if (other == org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance()) return this;
      if (!other.getStockSymbol().isEmpty()) {
        stockSymbol_ = other.stockSymbol_;
        onChanged();
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (!other.getOrderType().isEmpty()) {
        orderType_ = other.orderType_;
        onChanged();
      }
      if (other.getIsSentByPrimary() != false) {
        setIsSentByPrimary(other.getIsSentByPrimary());
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
      org.kasun.communication.grpc.generated.StockOrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.kasun.communication.grpc.generated.StockOrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object stockSymbol_ = "";
    /**
     * <code>string stockSymbol = 1;</code>
     * @return The stockSymbol.
     */
    public java.lang.String getStockSymbol() {
      java.lang.Object ref = stockSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stockSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stockSymbol = 1;</code>
     * @return The bytes for stockSymbol.
     */
    public com.google.protobuf.ByteString
        getStockSymbolBytes() {
      java.lang.Object ref = stockSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stockSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stockSymbol = 1;</code>
     * @param value The stockSymbol to set.
     * @return This builder for chaining.
     */
    public Builder setStockSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stockSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stockSymbol = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockSymbol() {
      
      stockSymbol_ = getDefaultInstance().getStockSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string stockSymbol = 1;</code>
     * @param value The bytes for stockSymbol to set.
     * @return This builder for chaining.
     */
    public Builder setStockSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stockSymbol_ = value;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object orderType_ = "";
    /**
     * <code>string orderType = 4;</code>
     * @return The orderType.
     */
    public java.lang.String getOrderType() {
      java.lang.Object ref = orderType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderType = 4;</code>
     * @return The bytes for orderType.
     */
    public com.google.protobuf.ByteString
        getOrderTypeBytes() {
      java.lang.Object ref = orderType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderType = 4;</code>
     * @param value The orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderType() {
      
      orderType_ = getDefaultInstance().getOrderType();
      onChanged();
      return this;
    }
    /**
     * <code>string orderType = 4;</code>
     * @param value The bytes for orderType to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderType_ = value;
      onChanged();
      return this;
    }

    private boolean isSentByPrimary_ ;
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @return The isSentByPrimary.
     */
    @java.lang.Override
    public boolean getIsSentByPrimary() {
      return isSentByPrimary_;
    }
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @param value The isSentByPrimary to set.
     * @return This builder for chaining.
     */
    public Builder setIsSentByPrimary(boolean value) {
      
      isSentByPrimary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isSentByPrimary = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSentByPrimary() {
      
      isSentByPrimary_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:org.kasun.communication.grpc.generated.StockOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:org.kasun.communication.grpc.generated.StockOrderRequest)
  private static final org.kasun.communication.grpc.generated.StockOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.kasun.communication.grpc.generated.StockOrderRequest();
  }

  public static org.kasun.communication.grpc.generated.StockOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StockOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<StockOrderRequest>() {
    @java.lang.Override
    public StockOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StockOrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StockOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StockOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.kasun.communication.grpc.generated.StockOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

