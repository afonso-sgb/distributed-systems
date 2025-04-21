package tplm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: tplm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TPLMServiceGrpc {

  private TPLMServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TPLMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tplm.TPLMProto.LockRequest,
      tplm.TPLMProto.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = tplm.TPLMProto.LockRequest.class,
      responseType = tplm.TPLMProto.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tplm.TPLMProto.LockRequest,
      tplm.TPLMProto.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<tplm.TPLMProto.LockRequest, tplm.TPLMProto.LockResponse> getLockMethod;
    if ((getLockMethod = TPLMServiceGrpc.getLockMethod) == null) {
      synchronized (TPLMServiceGrpc.class) {
        if ((getLockMethod = TPLMServiceGrpc.getLockMethod) == null) {
          TPLMServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<tplm.TPLMProto.LockRequest, tplm.TPLMProto.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tplm.TPLMProto.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tplm.TPLMProto.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TPLMServiceMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tplm.TPLMProto.UnlockRequest,
      tplm.TPLMProto.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = tplm.TPLMProto.UnlockRequest.class,
      responseType = tplm.TPLMProto.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tplm.TPLMProto.UnlockRequest,
      tplm.TPLMProto.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<tplm.TPLMProto.UnlockRequest, tplm.TPLMProto.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = TPLMServiceGrpc.getUnlockMethod) == null) {
      synchronized (TPLMServiceGrpc.class) {
        if ((getUnlockMethod = TPLMServiceGrpc.getUnlockMethod) == null) {
          TPLMServiceGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<tplm.TPLMProto.UnlockRequest, tplm.TPLMProto.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tplm.TPLMProto.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tplm.TPLMProto.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TPLMServiceMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TPLMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TPLMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TPLMServiceStub>() {
        @java.lang.Override
        public TPLMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TPLMServiceStub(channel, callOptions);
        }
      };
    return TPLMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TPLMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TPLMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TPLMServiceBlockingStub>() {
        @java.lang.Override
        public TPLMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TPLMServiceBlockingStub(channel, callOptions);
        }
      };
    return TPLMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TPLMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TPLMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TPLMServiceFutureStub>() {
        @java.lang.Override
        public TPLMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TPLMServiceFutureStub(channel, callOptions);
        }
      };
    return TPLMServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void lock(tplm.TPLMProto.LockRequest request,
        io.grpc.stub.StreamObserver<tplm.TPLMProto.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     */
    default void unlock(tplm.TPLMProto.UnlockRequest request,
        io.grpc.stub.StreamObserver<tplm.TPLMProto.UnlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TPLMService.
   */
  public static abstract class TPLMServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TPLMServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TPLMService.
   */
  public static final class TPLMServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TPLMServiceStub> {
    private TPLMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TPLMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TPLMServiceStub(channel, callOptions);
    }

    /**
     */
    public void lock(tplm.TPLMProto.LockRequest request,
        io.grpc.stub.StreamObserver<tplm.TPLMProto.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlock(tplm.TPLMProto.UnlockRequest request,
        io.grpc.stub.StreamObserver<tplm.TPLMProto.UnlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TPLMService.
   */
  public static final class TPLMServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TPLMServiceBlockingStub> {
    private TPLMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TPLMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TPLMServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public tplm.TPLMProto.LockResponse lock(tplm.TPLMProto.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public tplm.TPLMProto.UnlockResponse unlock(tplm.TPLMProto.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TPLMService.
   */
  public static final class TPLMServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TPLMServiceFutureStub> {
    private TPLMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TPLMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TPLMServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tplm.TPLMProto.LockResponse> lock(
        tplm.TPLMProto.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tplm.TPLMProto.UnlockResponse> unlock(
        tplm.TPLMProto.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOCK = 0;
  private static final int METHODID_UNLOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOCK:
          serviceImpl.lock((tplm.TPLMProto.LockRequest) request,
              (io.grpc.stub.StreamObserver<tplm.TPLMProto.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((tplm.TPLMProto.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<tplm.TPLMProto.UnlockResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tplm.TPLMProto.LockRequest,
              tplm.TPLMProto.LockResponse>(
                service, METHODID_LOCK)))
        .addMethod(
          getUnlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tplm.TPLMProto.UnlockRequest,
              tplm.TPLMProto.UnlockResponse>(
                service, METHODID_UNLOCK)))
        .build();
  }

  private static abstract class TPLMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TPLMServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tplm.TPLMProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TPLMService");
    }
  }

  private static final class TPLMServiceFileDescriptorSupplier
      extends TPLMServiceBaseDescriptorSupplier {
    TPLMServiceFileDescriptorSupplier() {}
  }

  private static final class TPLMServiceMethodDescriptorSupplier
      extends TPLMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TPLMServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TPLMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TPLMServiceFileDescriptorSupplier())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
