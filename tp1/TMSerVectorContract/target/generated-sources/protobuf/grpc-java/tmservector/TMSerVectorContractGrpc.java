package tmservector;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: tmservectorcontract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TMSerVectorContractGrpc {

  private TMSerVectorContractGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tmservector.TMSerVectorContract";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AddServerRequest,
      tmservector.Tmservectorcontract.AddServerResponse> getAddServerToCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addServerToCommit",
      requestType = tmservector.Tmservectorcontract.AddServerRequest.class,
      responseType = tmservector.Tmservectorcontract.AddServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AddServerRequest,
      tmservector.Tmservectorcontract.AddServerResponse> getAddServerToCommitMethod() {
    io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AddServerRequest, tmservector.Tmservectorcontract.AddServerResponse> getAddServerToCommitMethod;
    if ((getAddServerToCommitMethod = TMSerVectorContractGrpc.getAddServerToCommitMethod) == null) {
      synchronized (TMSerVectorContractGrpc.class) {
        if ((getAddServerToCommitMethod = TMSerVectorContractGrpc.getAddServerToCommitMethod) == null) {
          TMSerVectorContractGrpc.getAddServerToCommitMethod = getAddServerToCommitMethod =
              io.grpc.MethodDescriptor.<tmservector.Tmservectorcontract.AddServerRequest, tmservector.Tmservectorcontract.AddServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addServerToCommit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.AddServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.AddServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TMSerVectorContractMethodDescriptorSupplier("addServerToCommit"))
              .build();
        }
      }
    }
    return getAddServerToCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.PrepareRequest,
      tmservector.Tmservectorcontract.PrepareResponse> getPrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "prepare",
      requestType = tmservector.Tmservectorcontract.PrepareRequest.class,
      responseType = tmservector.Tmservectorcontract.PrepareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.PrepareRequest,
      tmservector.Tmservectorcontract.PrepareResponse> getPrepareMethod() {
    io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.PrepareRequest, tmservector.Tmservectorcontract.PrepareResponse> getPrepareMethod;
    if ((getPrepareMethod = TMSerVectorContractGrpc.getPrepareMethod) == null) {
      synchronized (TMSerVectorContractGrpc.class) {
        if ((getPrepareMethod = TMSerVectorContractGrpc.getPrepareMethod) == null) {
          TMSerVectorContractGrpc.getPrepareMethod = getPrepareMethod =
              io.grpc.MethodDescriptor.<tmservector.Tmservectorcontract.PrepareRequest, tmservector.Tmservectorcontract.PrepareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "prepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.PrepareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.PrepareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TMSerVectorContractMethodDescriptorSupplier("prepare"))
              .build();
        }
      }
    }
    return getPrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.CommitRequest,
      tmservector.Tmservectorcontract.CommitResponse> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commit",
      requestType = tmservector.Tmservectorcontract.CommitRequest.class,
      responseType = tmservector.Tmservectorcontract.CommitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.CommitRequest,
      tmservector.Tmservectorcontract.CommitResponse> getCommitMethod() {
    io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.CommitRequest, tmservector.Tmservectorcontract.CommitResponse> getCommitMethod;
    if ((getCommitMethod = TMSerVectorContractGrpc.getCommitMethod) == null) {
      synchronized (TMSerVectorContractGrpc.class) {
        if ((getCommitMethod = TMSerVectorContractGrpc.getCommitMethod) == null) {
          TMSerVectorContractGrpc.getCommitMethod = getCommitMethod =
              io.grpc.MethodDescriptor.<tmservector.Tmservectorcontract.CommitRequest, tmservector.Tmservectorcontract.CommitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.CommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.CommitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TMSerVectorContractMethodDescriptorSupplier("commit"))
              .build();
        }
      }
    }
    return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AbortRequest,
      tmservector.Tmservectorcontract.AbortResponse> getAbortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "abort",
      requestType = tmservector.Tmservectorcontract.AbortRequest.class,
      responseType = tmservector.Tmservectorcontract.AbortResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AbortRequest,
      tmservector.Tmservectorcontract.AbortResponse> getAbortMethod() {
    io.grpc.MethodDescriptor<tmservector.Tmservectorcontract.AbortRequest, tmservector.Tmservectorcontract.AbortResponse> getAbortMethod;
    if ((getAbortMethod = TMSerVectorContractGrpc.getAbortMethod) == null) {
      synchronized (TMSerVectorContractGrpc.class) {
        if ((getAbortMethod = TMSerVectorContractGrpc.getAbortMethod) == null) {
          TMSerVectorContractGrpc.getAbortMethod = getAbortMethod =
              io.grpc.MethodDescriptor.<tmservector.Tmservectorcontract.AbortRequest, tmservector.Tmservectorcontract.AbortResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "abort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.AbortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tmservector.Tmservectorcontract.AbortResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TMSerVectorContractMethodDescriptorSupplier("abort"))
              .build();
        }
      }
    }
    return getAbortMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TMSerVectorContractStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractStub>() {
        @java.lang.Override
        public TMSerVectorContractStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TMSerVectorContractStub(channel, callOptions);
        }
      };
    return TMSerVectorContractStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TMSerVectorContractBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractBlockingStub>() {
        @java.lang.Override
        public TMSerVectorContractBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TMSerVectorContractBlockingStub(channel, callOptions);
        }
      };
    return TMSerVectorContractBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TMSerVectorContractFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TMSerVectorContractFutureStub>() {
        @java.lang.Override
        public TMSerVectorContractFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TMSerVectorContractFutureStub(channel, callOptions);
        }
      };
    return TMSerVectorContractFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addServerToCommit(tmservector.Tmservectorcontract.AddServerRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AddServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddServerToCommitMethod(), responseObserver);
    }

    /**
     */
    default void prepare(tmservector.Tmservectorcontract.PrepareRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.PrepareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareMethod(), responseObserver);
    }

    /**
     */
    default void commit(tmservector.Tmservectorcontract.CommitRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.CommitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    default void abort(tmservector.Tmservectorcontract.AbortRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AbortResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAbortMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TMSerVectorContract.
   */
  public static abstract class TMSerVectorContractImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TMSerVectorContractGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TMSerVectorContract.
   */
  public static final class TMSerVectorContractStub
      extends io.grpc.stub.AbstractAsyncStub<TMSerVectorContractStub> {
    private TMSerVectorContractStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TMSerVectorContractStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TMSerVectorContractStub(channel, callOptions);
    }

    /**
     */
    public void addServerToCommit(tmservector.Tmservectorcontract.AddServerRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AddServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddServerToCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void prepare(tmservector.Tmservectorcontract.PrepareRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.PrepareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(tmservector.Tmservectorcontract.CommitRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.CommitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void abort(tmservector.Tmservectorcontract.AbortRequest request,
        io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AbortResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbortMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TMSerVectorContract.
   */
  public static final class TMSerVectorContractBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TMSerVectorContractBlockingStub> {
    private TMSerVectorContractBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TMSerVectorContractBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TMSerVectorContractBlockingStub(channel, callOptions);
    }

    /**
     */
    public tmservector.Tmservectorcontract.AddServerResponse addServerToCommit(tmservector.Tmservectorcontract.AddServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddServerToCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public tmservector.Tmservectorcontract.PrepareResponse prepare(tmservector.Tmservectorcontract.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareMethod(), getCallOptions(), request);
    }

    /**
     */
    public tmservector.Tmservectorcontract.CommitResponse commit(tmservector.Tmservectorcontract.CommitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public tmservector.Tmservectorcontract.AbortResponse abort(tmservector.Tmservectorcontract.AbortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbortMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TMSerVectorContract.
   */
  public static final class TMSerVectorContractFutureStub
      extends io.grpc.stub.AbstractFutureStub<TMSerVectorContractFutureStub> {
    private TMSerVectorContractFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TMSerVectorContractFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TMSerVectorContractFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tmservector.Tmservectorcontract.AddServerResponse> addServerToCommit(
        tmservector.Tmservectorcontract.AddServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddServerToCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tmservector.Tmservectorcontract.PrepareResponse> prepare(
        tmservector.Tmservectorcontract.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tmservector.Tmservectorcontract.CommitResponse> commit(
        tmservector.Tmservectorcontract.CommitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tmservector.Tmservectorcontract.AbortResponse> abort(
        tmservector.Tmservectorcontract.AbortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbortMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_SERVER_TO_COMMIT = 0;
  private static final int METHODID_PREPARE = 1;
  private static final int METHODID_COMMIT = 2;
  private static final int METHODID_ABORT = 3;

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
        case METHODID_ADD_SERVER_TO_COMMIT:
          serviceImpl.addServerToCommit((tmservector.Tmservectorcontract.AddServerRequest) request,
              (io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AddServerResponse>) responseObserver);
          break;
        case METHODID_PREPARE:
          serviceImpl.prepare((tmservector.Tmservectorcontract.PrepareRequest) request,
              (io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.PrepareResponse>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((tmservector.Tmservectorcontract.CommitRequest) request,
              (io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.CommitResponse>) responseObserver);
          break;
        case METHODID_ABORT:
          serviceImpl.abort((tmservector.Tmservectorcontract.AbortRequest) request,
              (io.grpc.stub.StreamObserver<tmservector.Tmservectorcontract.AbortResponse>) responseObserver);
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
          getAddServerToCommitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tmservector.Tmservectorcontract.AddServerRequest,
              tmservector.Tmservectorcontract.AddServerResponse>(
                service, METHODID_ADD_SERVER_TO_COMMIT)))
        .addMethod(
          getPrepareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tmservector.Tmservectorcontract.PrepareRequest,
              tmservector.Tmservectorcontract.PrepareResponse>(
                service, METHODID_PREPARE)))
        .addMethod(
          getCommitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tmservector.Tmservectorcontract.CommitRequest,
              tmservector.Tmservectorcontract.CommitResponse>(
                service, METHODID_COMMIT)))
        .addMethod(
          getAbortMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tmservector.Tmservectorcontract.AbortRequest,
              tmservector.Tmservectorcontract.AbortResponse>(
                service, METHODID_ABORT)))
        .build();
  }

  private static abstract class TMSerVectorContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TMSerVectorContractBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tmservector.Tmservectorcontract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TMSerVectorContract");
    }
  }

  private static final class TMSerVectorContractFileDescriptorSupplier
      extends TMSerVectorContractBaseDescriptorSupplier {
    TMSerVectorContractFileDescriptorSupplier() {}
  }

  private static final class TMSerVectorContractMethodDescriptorSupplier
      extends TMSerVectorContractBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TMSerVectorContractMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TMSerVectorContractGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TMSerVectorContractFileDescriptorSupplier())
              .addMethod(getAddServerToCommitMethod())
              .addMethod(getPrepareMethod())
              .addMethod(getCommitMethod())
              .addMethod(getAbortMethod())
              .build();
        }
      }
    }
    return result;
  }
}
