package org.kasun.communication.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: StockTradingSystem.proto")
public final class DeleteInventoryServiceGrpc {

  private DeleteInventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "org.kasun.communication.grpc.generated.DeleteInventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.DeleteStockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getDeleteStockOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStockOrder",
      requestType = org.kasun.communication.grpc.generated.DeleteStockOrderRequest.class,
      responseType = org.kasun.communication.grpc.generated.StockOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.DeleteStockOrderRequest,
      org.kasun.communication.grpc.generated.StockOrderResponse> getDeleteStockOrderMethod() {
    io.grpc.MethodDescriptor<org.kasun.communication.grpc.generated.DeleteStockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse> getDeleteStockOrderMethod;
    if ((getDeleteStockOrderMethod = DeleteInventoryServiceGrpc.getDeleteStockOrderMethod) == null) {
      synchronized (DeleteInventoryServiceGrpc.class) {
        if ((getDeleteStockOrderMethod = DeleteInventoryServiceGrpc.getDeleteStockOrderMethod) == null) {
          DeleteInventoryServiceGrpc.getDeleteStockOrderMethod = getDeleteStockOrderMethod =
              io.grpc.MethodDescriptor.<org.kasun.communication.grpc.generated.DeleteStockOrderRequest, org.kasun.communication.grpc.generated.StockOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteStockOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.DeleteStockOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.kasun.communication.grpc.generated.StockOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeleteInventoryServiceMethodDescriptorSupplier("deleteStockOrder"))
              .build();
        }
      }
    }
    return getDeleteStockOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeleteInventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceStub>() {
        @java.lang.Override
        public DeleteInventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeleteInventoryServiceStub(channel, callOptions);
        }
      };
    return DeleteInventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeleteInventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceBlockingStub>() {
        @java.lang.Override
        public DeleteInventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeleteInventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return DeleteInventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeleteInventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeleteInventoryServiceFutureStub>() {
        @java.lang.Override
        public DeleteInventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeleteInventoryServiceFutureStub(channel, callOptions);
        }
      };
    return DeleteInventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeleteInventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteStockOrder(org.kasun.communication.grpc.generated.DeleteStockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStockOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteStockOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.kasun.communication.grpc.generated.DeleteStockOrderRequest,
                org.kasun.communication.grpc.generated.StockOrderResponse>(
                  this, METHODID_DELETE_STOCK_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class DeleteInventoryServiceStub extends io.grpc.stub.AbstractAsyncStub<DeleteInventoryServiceStub> {
    private DeleteInventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteInventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeleteInventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteStockOrder(org.kasun.communication.grpc.generated.DeleteStockOrderRequest request,
        io.grpc.stub.StreamObserver<org.kasun.communication.grpc.generated.StockOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStockOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeleteInventoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeleteInventoryServiceBlockingStub> {
    private DeleteInventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteInventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeleteInventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.kasun.communication.grpc.generated.StockOrderResponse deleteStockOrder(org.kasun.communication.grpc.generated.DeleteStockOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStockOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeleteInventoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeleteInventoryServiceFutureStub> {
    private DeleteInventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteInventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeleteInventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.kasun.communication.grpc.generated.StockOrderResponse> deleteStockOrder(
        org.kasun.communication.grpc.generated.DeleteStockOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStockOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_STOCK_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeleteInventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeleteInventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_STOCK_ORDER:
          serviceImpl.deleteStockOrder((org.kasun.communication.grpc.generated.DeleteStockOrderRequest) request,
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

  private static abstract class DeleteInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeleteInventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.kasun.communication.grpc.generated.StockTradingSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeleteInventoryService");
    }
  }

  private static final class DeleteInventoryServiceFileDescriptorSupplier
      extends DeleteInventoryServiceBaseDescriptorSupplier {
    DeleteInventoryServiceFileDescriptorSupplier() {}
  }

  private static final class DeleteInventoryServiceMethodDescriptorSupplier
      extends DeleteInventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeleteInventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeleteInventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeleteInventoryServiceFileDescriptorSupplier())
              .addMethod(getDeleteStockOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
