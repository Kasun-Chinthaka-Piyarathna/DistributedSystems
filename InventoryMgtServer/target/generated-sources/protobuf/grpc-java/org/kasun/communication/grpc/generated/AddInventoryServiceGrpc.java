package org.kasun.communication.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: StockTradingSystem.proto")
public final class AddInventoryServiceGrpc {

  private AddInventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "org.kasun.communication.grpc.generated.AddInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.StockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getAddStockOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addStockOrder",
      requestType = org.kasun.communication.grpc.generated.StockOrderRequest.class,
      responseType = org.kasun.communication.grpc.generated.StockOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.StockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getAddStockOrderMethod() {
    io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.StockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse> getAddStockOrderMethod;
    if ((getAddStockOrderMethod = AddInventoryServiceGrpc.getAddStockOrderMethod) == null) {
      synchronized (AddInventoryServiceGrpc.class) {
        if ((getAddStockOrderMethod = AddInventoryServiceGrpc.getAddStockOrderMethod) == null) {
          AddInventoryServiceGrpc.getAddStockOrderMethod = getAddStockOrderMethod =
              io.grpc.MethodDescriptor.<org.kasun.communication.grpc.generated.StockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addStockOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.StockOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.StockOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddInventoryServiceMethodDescriptorSupplier("addStockOrder"))
              .build();
        }
      }
    }
    return getAddStockOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceStub>() {
        @java.lang.Override
        public AddInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddInventoryServiceStub(channel, callOptions);
        }
      };
    return AddInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceBlockingStub>() {
        @java.lang.Override
        public AddInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return AddInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddInventoryServiceFutureStub>() {
        @java.lang.Override
        public AddInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return AddInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddInventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addStockOrder(org.kasun.communication.grpc.generated.StockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStockOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddStockOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.kasun.communication.grpc.generated.StockOrderRequest,
                org.kasun.communication.grpc.generated.StockOrderResponse>(
                  this, METHODID_ADD_STOCK_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class AddInventoryServiceStub extends io.grpc.stub.AbstractAsyncStub<AddInventoryServiceStub> {
    private AddInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void addStockOrder(org.kasun.communication.grpc.generated.StockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStockOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddInventoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddInventoryServiceBlockingStub> {
    private AddInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.kasun.communication.grpc.generated.StockOrderResponse addStockOrder(org.kasun.communication.grpc.generated.StockOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStockOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddInventoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddInventoryServiceFutureStub> {
    private AddInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.kasun.communication.grpc.generated.StockOrderResponse> addStockOrder(
        org.kasun.communication.grpc.generated.StockOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStockOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STOCK_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddInventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddInventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_STOCK_ORDER:
          serviceImpl.addStockOrder((org.kasun.communication.grpc.generated.StockOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AddInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddInventoryService");
    }
  }

  private static final class AddInventoryServiceFileDescriptorSupplier
      extends AddInventoryServiceBaseDescriptorSupplier {
    AddInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class AddInventoryServiceMethodDescriptorSupplier
      extends AddInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddInventoryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddInventoryServiceFileDescriptorSupplier())
              .addMethod(getAddStockOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
