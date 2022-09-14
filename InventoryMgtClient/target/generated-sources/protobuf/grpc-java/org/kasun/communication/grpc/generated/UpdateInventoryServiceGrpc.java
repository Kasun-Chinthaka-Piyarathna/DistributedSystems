package org.kasun.communication.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: StockTradingSystem.proto")
public final class UpdateInventoryServiceGrpc {

  private UpdateInventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "org.kasun.communication.grpc.generated.UpdateInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.UpdateStockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getUpdateStockOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStockOrder",
      requestType = org.kasun.communication.grpc.generated.UpdateStockOrderRequest.class,
      responseType = org.kasun.communication.grpc.generated.StockOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.UpdateStockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getUpdateStockOrderMethod() {
    io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.UpdateStockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse> getUpdateStockOrderMethod;
    if ((getUpdateStockOrderMethod = UpdateInventoryServiceGrpc.getUpdateStockOrderMethod) == null) {
      synchronized (UpdateInventoryServiceGrpc.class) {
        if ((getUpdateStockOrderMethod = UpdateInventoryServiceGrpc.getUpdateStockOrderMethod) == null) {
          UpdateInventoryServiceGrpc.getUpdateStockOrderMethod = getUpdateStockOrderMethod =
              io.grpc.MethodDescriptor.<org.kasun.communication.grpc.generated.UpdateStockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateStockOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.UpdateStockOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.StockOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateInventoryServiceMethodDescriptorSupplier("updateStockOrder"))
              .build();
        }
      }
    }
    return getUpdateStockOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceStub>() {
        @java.lang.Override
        public UpdateInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateInventoryServiceStub(channel, callOptions);
        }
      };
    return UpdateInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceBlockingStub>() {
        @java.lang.Override
        public UpdateInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return UpdateInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateInventoryServiceFutureStub>() {
        @java.lang.Override
        public UpdateInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return UpdateInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UpdateInventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateStockOrder(org.kasun.communication.grpc.generated.UpdateStockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStockOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateStockOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.kasun.communication.grpc.generated.UpdateStockOrderRequest,
                org.kasun.communication.grpc.generated.StockOrderResponse>(
                  this, METHODID_UPDATE_STOCK_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateInventoryServiceStub extends io.grpc.stub.AbstractAsyncStub<UpdateInventoryServiceStub> {
    private UpdateInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateStockOrder(org.kasun.communication.grpc.generated.UpdateStockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStockOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateInventoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UpdateInventoryServiceBlockingStub> {
    private UpdateInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.kasun.communication.grpc.generated.StockOrderResponse updateStockOrder(org.kasun.communication.grpc.generated.UpdateStockOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStockOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateInventoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UpdateInventoryServiceFutureStub> {
    private UpdateInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.kasun.communication.grpc.generated.StockOrderResponse> updateStockOrder(
        org.kasun.communication.grpc.generated.UpdateStockOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStockOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_STOCK_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateInventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateInventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_STOCK_ORDER:
          serviceImpl.updateStockOrder((org.kasun.communication.grpc.generated.UpdateStockOrderRequest) request,
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

  private static abstract class UpdateInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateInventoryService");
    }
  }

  private static final class UpdateInventoryServiceFileDescriptorSupplier
      extends UpdateInventoryServiceBaseDescriptorSupplier {
    UpdateInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class UpdateInventoryServiceMethodDescriptorSupplier
      extends UpdateInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateInventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateInventoryServiceFileDescriptorSupplier())
              .addMethod(getUpdateStockOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
