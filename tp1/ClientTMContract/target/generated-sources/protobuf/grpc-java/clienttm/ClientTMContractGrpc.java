package clienttm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: clienttmcontract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientTMContractGrpc {

  private ClientTMContractGrpc() {}

  public static final java.lang.String SERVICE_NAME = "clienttm.ClientTMContract";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<clienttm.Clienttmcontract.GetTransactionIDRequest,
      clienttm.Clienttmcontract.GetTransactionIDResponse> getGetTransactionIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransactionID",
      requestType = clienttm.Clienttmcontract.GetTransactionIDRequest.class,
      responseType = clienttm.Clienttmcontract.GetTransactionIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clienttm.Clienttmcontract.GetTransactionIDRequest,
      clienttm.Clienttmcontract.GetTransactionIDResponse> getGetTransactionIDMethod() {
    io.grpc.MethodDescriptor<clienttm.Clienttmcontract.GetTransactionIDRequest, clienttm.Clienttmcontract.GetTransactionIDResponse> getGetTransactionIDMethod;
    if ((getGetTransactionIDMethod = ClientTMContractGrpc.getGetTransactionIDMethod) == null) {
      synchronized (ClientTMContractGrpc.class) {
        if ((getGetTransactionIDMethod = ClientTMContractGrpc.getGetTransactionIDMethod) == null) {
          ClientTMContractGrpc.getGetTransactionIDMethod = getGetTransactionIDMethod =
              io.grpc.MethodDescriptor.<clienttm.Clienttmcontract.GetTransactionIDRequest, clienttm.Clienttmcontract.GetTransactionIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTransactionID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clienttm.Clienttmcontract.GetTransactionIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clienttm.Clienttmcontract.GetTransactionIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientTMContractMethodDescriptorSupplier("getTransactionID"))
              .build();
        }
      }
    }
    return getGetTransactionIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<clienttm.Clienttmcontract.EndTransactionRequest,
      clienttm.Clienttmcontract.EndTransactionResponse> getEndTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "endTransaction",
      requestType = clienttm.Clienttmcontract.EndTransactionRequest.class,
      responseType = clienttm.Clienttmcontract.EndTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clienttm.Clienttmcontract.EndTransactionRequest,
      clienttm.Clienttmcontract.EndTransactionResponse> getEndTransactionMethod() {
    io.grpc.MethodDescriptor<clienttm.Clienttmcontract.EndTransactionRequest, clienttm.Clienttmcontract.EndTransactionResponse> getEndTransactionMethod;
    if ((getEndTransactionMethod = ClientTMContractGrpc.getEndTransactionMethod) == null) {
      synchronized (ClientTMContractGrpc.class) {
        if ((getEndTransactionMethod = ClientTMContractGrpc.getEndTransactionMethod) == null) {
          ClientTMContractGrpc.getEndTransactionMethod = getEndTransactionMethod =
              io.grpc.MethodDescriptor.<clienttm.Clienttmcontract.EndTransactionRequest, clienttm.Clienttmcontract.EndTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "endTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clienttm.Clienttmcontract.EndTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clienttm.Clienttmcontract.EndTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientTMContractMethodDescriptorSupplier("endTransaction"))
              .build();
        }
      }
    }
    return getEndTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientTMContractStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientTMContractStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientTMContractStub>() {
        @java.lang.Override
        public ClientTMContractStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientTMContractStub(channel, callOptions);
        }
      };
    return ClientTMContractStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientTMContractBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientTMContractBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientTMContractBlockingStub>() {
        @java.lang.Override
        public ClientTMContractBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientTMContractBlockingStub(channel, callOptions);
        }
      };
    return ClientTMContractBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientTMContractFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientTMContractFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientTMContractFutureStub>() {
        @java.lang.Override
        public ClientTMContractFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientTMContractFutureStub(channel, callOptions);
        }
      };
    return ClientTMContractFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTransactionID(clienttm.Clienttmcontract.GetTransactionIDRequest request,
        io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.GetTransactionIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionIDMethod(), responseObserver);
    }

    /**
     */
    default void endTransaction(clienttm.Clienttmcontract.EndTransactionRequest request,
        io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.EndTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndTransactionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientTMContract.
   */
  public static abstract class ClientTMContractImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientTMContractGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientTMContract.
   */
  public static final class ClientTMContractStub
      extends io.grpc.stub.AbstractAsyncStub<ClientTMContractStub> {
    private ClientTMContractStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientTMContractStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientTMContractStub(channel, callOptions);
    }

    /**
     */
    public void getTransactionID(clienttm.Clienttmcontract.GetTransactionIDRequest request,
        io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.GetTransactionIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endTransaction(clienttm.Clienttmcontract.EndTransactionRequest request,
        io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.EndTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientTMContract.
   */
  public static final class ClientTMContractBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientTMContractBlockingStub> {
    private ClientTMContractBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientTMContractBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientTMContractBlockingStub(channel, callOptions);
    }

    /**
     */
    public clienttm.Clienttmcontract.GetTransactionIDResponse getTransactionID(clienttm.Clienttmcontract.GetTransactionIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public clienttm.Clienttmcontract.EndTransactionResponse endTransaction(clienttm.Clienttmcontract.EndTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientTMContract.
   */
  public static final class ClientTMContractFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientTMContractFutureStub> {
    private ClientTMContractFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientTMContractFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientTMContractFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clienttm.Clienttmcontract.GetTransactionIDResponse> getTransactionID(
        clienttm.Clienttmcontract.GetTransactionIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clienttm.Clienttmcontract.EndTransactionResponse> endTransaction(
        clienttm.Clienttmcontract.EndTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTION_ID = 0;
  private static final int METHODID_END_TRANSACTION = 1;

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
        case METHODID_GET_TRANSACTION_ID:
          serviceImpl.getTransactionID((clienttm.Clienttmcontract.GetTransactionIDRequest) request,
              (io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.GetTransactionIDResponse>) responseObserver);
          break;
        case METHODID_END_TRANSACTION:
          serviceImpl.endTransaction((clienttm.Clienttmcontract.EndTransactionRequest) request,
              (io.grpc.stub.StreamObserver<clienttm.Clienttmcontract.EndTransactionResponse>) responseObserver);
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
          getGetTransactionIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              clienttm.Clienttmcontract.GetTransactionIDRequest,
              clienttm.Clienttmcontract.GetTransactionIDResponse>(
                service, METHODID_GET_TRANSACTION_ID)))
        .addMethod(
          getEndTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              clienttm.Clienttmcontract.EndTransactionRequest,
              clienttm.Clienttmcontract.EndTransactionResponse>(
                service, METHODID_END_TRANSACTION)))
        .build();
  }

  private static abstract class ClientTMContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientTMContractBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clienttm.Clienttmcontract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientTMContract");
    }
  }

  private static final class ClientTMContractFileDescriptorSupplier
      extends ClientTMContractBaseDescriptorSupplier {
    ClientTMContractFileDescriptorSupplier() {}
  }

  private static final class ClientTMContractMethodDescriptorSupplier
      extends ClientTMContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientTMContractMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientTMContractGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientTMContractFileDescriptorSupplier())
              .addMethod(getGetTransactionIDMethod())
              .addMethod(getEndTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
