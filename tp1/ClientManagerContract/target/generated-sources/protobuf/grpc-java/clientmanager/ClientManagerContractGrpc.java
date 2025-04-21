package clientmanager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: clientmanagarcontract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientManagerContractGrpc {

  private ClientManagerContractGrpc() {}

  public static final java.lang.String SERVICE_NAME = "clientmanager.ClientManagerContract";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<clientmanager.Clientmanagarcontract.GetAllServersRequest,
      clientmanager.Clientmanagarcontract.GetAllServersResponse> getGetAllServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllServers",
      requestType = clientmanager.Clientmanagarcontract.GetAllServersRequest.class,
      responseType = clientmanager.Clientmanagarcontract.GetAllServersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clientmanager.Clientmanagarcontract.GetAllServersRequest,
      clientmanager.Clientmanagarcontract.GetAllServersResponse> getGetAllServersMethod() {
    io.grpc.MethodDescriptor<clientmanager.Clientmanagarcontract.GetAllServersRequest, clientmanager.Clientmanagarcontract.GetAllServersResponse> getGetAllServersMethod;
    if ((getGetAllServersMethod = ClientManagerContractGrpc.getGetAllServersMethod) == null) {
      synchronized (ClientManagerContractGrpc.class) {
        if ((getGetAllServersMethod = ClientManagerContractGrpc.getGetAllServersMethod) == null) {
          ClientManagerContractGrpc.getGetAllServersMethod = getGetAllServersMethod =
              io.grpc.MethodDescriptor.<clientmanager.Clientmanagarcontract.GetAllServersRequest, clientmanager.Clientmanagarcontract.GetAllServersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientmanager.Clientmanagarcontract.GetAllServersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clientmanager.Clientmanagarcontract.GetAllServersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientManagerContractMethodDescriptorSupplier("getAllServers"))
              .build();
        }
      }
    }
    return getGetAllServersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientManagerContractStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractStub>() {
        @java.lang.Override
        public ClientManagerContractStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientManagerContractStub(channel, callOptions);
        }
      };
    return ClientManagerContractStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientManagerContractBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractBlockingStub>() {
        @java.lang.Override
        public ClientManagerContractBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientManagerContractBlockingStub(channel, callOptions);
        }
      };
    return ClientManagerContractBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientManagerContractFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientManagerContractFutureStub>() {
        @java.lang.Override
        public ClientManagerContractFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientManagerContractFutureStub(channel, callOptions);
        }
      };
    return ClientManagerContractFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllServers(clientmanager.Clientmanagarcontract.GetAllServersRequest request,
        io.grpc.stub.StreamObserver<clientmanager.Clientmanagarcontract.GetAllServersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllServersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientManagerContract.
   */
  public static abstract class ClientManagerContractImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientManagerContractGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientManagerContract.
   */
  public static final class ClientManagerContractStub
      extends io.grpc.stub.AbstractAsyncStub<ClientManagerContractStub> {
    private ClientManagerContractStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientManagerContractStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientManagerContractStub(channel, callOptions);
    }

    /**
     */
    public void getAllServers(clientmanager.Clientmanagarcontract.GetAllServersRequest request,
        io.grpc.stub.StreamObserver<clientmanager.Clientmanagarcontract.GetAllServersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllServersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientManagerContract.
   */
  public static final class ClientManagerContractBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientManagerContractBlockingStub> {
    private ClientManagerContractBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientManagerContractBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientManagerContractBlockingStub(channel, callOptions);
    }

    /**
     */
    public clientmanager.Clientmanagarcontract.GetAllServersResponse getAllServers(clientmanager.Clientmanagarcontract.GetAllServersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllServersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientManagerContract.
   */
  public static final class ClientManagerContractFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientManagerContractFutureStub> {
    private ClientManagerContractFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientManagerContractFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientManagerContractFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clientmanager.Clientmanagarcontract.GetAllServersResponse> getAllServers(
        clientmanager.Clientmanagarcontract.GetAllServersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllServersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_SERVERS = 0;

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
        case METHODID_GET_ALL_SERVERS:
          serviceImpl.getAllServers((clientmanager.Clientmanagarcontract.GetAllServersRequest) request,
              (io.grpc.stub.StreamObserver<clientmanager.Clientmanagarcontract.GetAllServersResponse>) responseObserver);
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
          getGetAllServersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              clientmanager.Clientmanagarcontract.GetAllServersRequest,
              clientmanager.Clientmanagarcontract.GetAllServersResponse>(
                service, METHODID_GET_ALL_SERVERS)))
        .build();
  }

  private static abstract class ClientManagerContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientManagerContractBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clientmanager.Clientmanagarcontract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientManagerContract");
    }
  }

  private static final class ClientManagerContractFileDescriptorSupplier
      extends ClientManagerContractBaseDescriptorSupplier {
    ClientManagerContractFileDescriptorSupplier() {}
  }

  private static final class ClientManagerContractMethodDescriptorSupplier
      extends ClientManagerContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientManagerContractMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientManagerContractGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientManagerContractFileDescriptorSupplier())
              .addMethod(getGetAllServersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
