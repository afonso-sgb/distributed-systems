package managerservectorstubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: Manager_SerVector.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManagerSerVectorServiceGrpc {

  private ManagerSerVectorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "managerservectorservice.ManagerSerVectorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<managerservectorstubs.SerVectorAddress,
      managerservectorstubs.VoidResponse> getRegisterSerVectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerSerVector",
      requestType = managerservectorstubs.SerVectorAddress.class,
      responseType = managerservectorstubs.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<managerservectorstubs.SerVectorAddress,
      managerservectorstubs.VoidResponse> getRegisterSerVectorMethod() {
    io.grpc.MethodDescriptor<managerservectorstubs.SerVectorAddress, managerservectorstubs.VoidResponse> getRegisterSerVectorMethod;
    if ((getRegisterSerVectorMethod = ManagerSerVectorServiceGrpc.getRegisterSerVectorMethod) == null) {
      synchronized (ManagerSerVectorServiceGrpc.class) {
        if ((getRegisterSerVectorMethod = ManagerSerVectorServiceGrpc.getRegisterSerVectorMethod) == null) {
          ManagerSerVectorServiceGrpc.getRegisterSerVectorMethod = getRegisterSerVectorMethod =
              io.grpc.MethodDescriptor.<managerservectorstubs.SerVectorAddress, managerservectorstubs.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerSerVector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  managerservectorstubs.SerVectorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  managerservectorstubs.VoidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagerSerVectorServiceMethodDescriptorSupplier("registerSerVector"))
              .build();
        }
      }
    }
    return getRegisterSerVectorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagerSerVectorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceStub>() {
        @java.lang.Override
        public ManagerSerVectorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerSerVectorServiceStub(channel, callOptions);
        }
      };
    return ManagerSerVectorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagerSerVectorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceBlockingStub>() {
        @java.lang.Override
        public ManagerSerVectorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerSerVectorServiceBlockingStub(channel, callOptions);
        }
      };
    return ManagerSerVectorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagerSerVectorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagerSerVectorServiceFutureStub>() {
        @java.lang.Override
        public ManagerSerVectorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagerSerVectorServiceFutureStub(channel, callOptions);
        }
      };
    return ManagerSerVectorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerSerVector(managerservectorstubs.SerVectorAddress request,
        io.grpc.stub.StreamObserver<managerservectorstubs.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterSerVectorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ManagerSerVectorService.
   */
  public static abstract class ManagerSerVectorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ManagerSerVectorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ManagerSerVectorService.
   */
  public static final class ManagerSerVectorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ManagerSerVectorServiceStub> {
    private ManagerSerVectorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerSerVectorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerSerVectorServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerSerVector(managerservectorstubs.SerVectorAddress request,
        io.grpc.stub.StreamObserver<managerservectorstubs.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterSerVectorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ManagerSerVectorService.
   */
  public static final class ManagerSerVectorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ManagerSerVectorServiceBlockingStub> {
    private ManagerSerVectorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerSerVectorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerSerVectorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public managerservectorstubs.VoidResponse registerSerVector(managerservectorstubs.SerVectorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterSerVectorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ManagerSerVectorService.
   */
  public static final class ManagerSerVectorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ManagerSerVectorServiceFutureStub> {
    private ManagerSerVectorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagerSerVectorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagerSerVectorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<managerservectorstubs.VoidResponse> registerSerVector(
        managerservectorstubs.SerVectorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterSerVectorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SER_VECTOR = 0;

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
        case METHODID_REGISTER_SER_VECTOR:
          serviceImpl.registerSerVector((managerservectorstubs.SerVectorAddress) request,
              (io.grpc.stub.StreamObserver<managerservectorstubs.VoidResponse>) responseObserver);
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
          getRegisterSerVectorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              managerservectorstubs.SerVectorAddress,
              managerservectorstubs.VoidResponse>(
                service, METHODID_REGISTER_SER_VECTOR)))
        .build();
  }

  private static abstract class ManagerSerVectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagerSerVectorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return managerservectorstubs.ManagerSerVector.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagerSerVectorService");
    }
  }

  private static final class ManagerSerVectorServiceFileDescriptorSupplier
      extends ManagerSerVectorServiceBaseDescriptorSupplier {
    ManagerSerVectorServiceFileDescriptorSupplier() {}
  }

  private static final class ManagerSerVectorServiceMethodDescriptorSupplier
      extends ManagerSerVectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ManagerSerVectorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ManagerSerVectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagerSerVectorServiceFileDescriptorSupplier())
              .addMethod(getRegisterSerVectorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
