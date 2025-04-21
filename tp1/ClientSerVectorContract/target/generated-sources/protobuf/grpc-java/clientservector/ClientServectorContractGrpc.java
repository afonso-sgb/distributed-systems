package clientservector;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: ClientServectorContract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientServectorContractGrpc {

  private ClientServectorContractGrpc() {}

  public static final java.lang.String SERVICE_NAME = "clientservector.ClientServectorContract";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.ReadRequest,
      clientservector.ClientServectorContractOuterClass.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = clientservector.ClientServectorContractOuterClass.ReadRequest.class,
      responseType = clientservector.ClientServectorContractOuterClass.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.ReadRequest,
      clientservector.ClientServectorContractOuterClass.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.ReadRequest, clientservector.ClientServectorContractOuterClass.ReadResponse> getReadMethod;
    if ((getReadMethod = ClientServectorContractGrpc.getReadMethod) == null) {
      synchronized (ClientServectorContractGrpc.class) {
        if ((getReadMethod = ClientServectorContractGrpc.getReadMethod) == null) {
          ClientServectorContractGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<clientservector.ClientServectorContractOuterClass.ReadRequest, clientservector.ClientServectorContractOuterClass.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientservector.ClientServectorContractOuterClass.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientservector.ClientServectorContractOuterClass.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServectorContractMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.WriteRequest,
      clientservector.ClientServectorContractOuterClass.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "write",
      requestType = clientservector.ClientServectorContractOuterClass.WriteRequest.class,
      responseType = clientservector.ClientServectorContractOuterClass.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.WriteRequest,
      clientservector.ClientServectorContractOuterClass.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<clientservector.ClientServectorContractOuterClass.WriteRequest, clientservector.ClientServectorContractOuterClass.WriteResponse> getWriteMethod;
    if ((getWriteMethod = ClientServectorContractGrpc.getWriteMethod) == null) {
      synchronized (ClientServectorContractGrpc.class) {
        if ((getWriteMethod = ClientServectorContractGrpc.getWriteMethod) == null) {
          ClientServectorContractGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<clientservector.ClientServectorContractOuterClass.WriteRequest, clientservector.ClientServectorContractOuterClass.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientservector.ClientServectorContractOuterClass.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientservector.ClientServectorContractOuterClass.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServectorContractMethodDescriptorSupplier("write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServectorContractStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractStub>() {
        @java.lang.Override
        public ClientServectorContractStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServectorContractStub(channel, callOptions);
        }
      };
    return ClientServectorContractStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServectorContractBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractBlockingStub>() {
        @java.lang.Override
        public ClientServectorContractBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServectorContractBlockingStub(channel, callOptions);
        }
      };
    return ClientServectorContractBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServectorContractFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServectorContractFutureStub>() {
        @java.lang.Override
        public ClientServectorContractFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServectorContractFutureStub(channel, callOptions);
        }
      };
    return ClientServectorContractFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void read(clientservector.ClientServectorContractOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    default void write(clientservector.ClientServectorContractOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.WriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientServectorContract.
   */
  public static abstract class ClientServectorContractImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientServectorContractGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientServectorContract.
   */
  public static final class ClientServectorContractStub
      extends io.grpc.stub.AbstractAsyncStub<ClientServectorContractStub> {
    private ClientServectorContractStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServectorContractStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServectorContractStub(channel, callOptions);
    }

    /**
     */
    public void read(clientservector.ClientServectorContractOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(clientservector.ClientServectorContractOuterClass.WriteRequest request,
        io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.WriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientServectorContract.
   */
  public static final class ClientServectorContractBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientServectorContractBlockingStub> {
    private ClientServectorContractBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServectorContractBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServectorContractBlockingStub(channel, callOptions);
    }

    /**
     */
    public clientservector.ClientServectorContractOuterClass.ReadResponse read(clientservector.ClientServectorContractOuterClass.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public clientservector.ClientServectorContractOuterClass.WriteResponse write(clientservector.ClientServectorContractOuterClass.WriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientServectorContract.
   */
  public static final class ClientServectorContractFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientServectorContractFutureStub> {
    private ClientServectorContractFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServectorContractFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServectorContractFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clientservector.ClientServectorContractOuterClass.ReadResponse> read(
        clientservector.ClientServectorContractOuterClass.ReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clientservector.ClientServectorContractOuterClass.WriteResponse> write(
        clientservector.ClientServectorContractOuterClass.WriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;

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
        case METHODID_READ:
          serviceImpl.read((clientservector.ClientServectorContractOuterClass.ReadRequest) request,
              (io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.ReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((clientservector.ClientServectorContractOuterClass.WriteRequest) request,
              (io.grpc.stub.StreamObserver<clientservector.ClientServectorContractOuterClass.WriteResponse>) responseObserver);
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
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              clientservector.ClientServectorContractOuterClass.ReadRequest,
              clientservector.ClientServectorContractOuterClass.ReadResponse>(
                service, METHODID_READ)))
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              clientservector.ClientServectorContractOuterClass.WriteRequest,
              clientservector.ClientServectorContractOuterClass.WriteResponse>(
                service, METHODID_WRITE)))
        .build();
  }

  private static abstract class ClientServectorContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServectorContractBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clientservector.ClientServectorContractOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientServectorContract");
    }
  }

  private static final class ClientServectorContractFileDescriptorSupplier
      extends ClientServectorContractBaseDescriptorSupplier {
    ClientServectorContractFileDescriptorSupplier() {}
  }

  private static final class ClientServectorContractMethodDescriptorSupplier
      extends ClientServectorContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientServectorContractMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientServectorContractGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServectorContractFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
