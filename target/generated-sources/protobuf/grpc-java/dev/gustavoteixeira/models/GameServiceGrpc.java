package dev.gustavoteixeira.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: game-service.proto")
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final String SERVICE_NAME = "GameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.gustavoteixeira.models.Void,
      dev.gustavoteixeira.models.GameState> getRollDiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rollDice",
      requestType = dev.gustavoteixeira.models.Void.class,
      responseType = dev.gustavoteixeira.models.GameState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<dev.gustavoteixeira.models.Void,
      dev.gustavoteixeira.models.GameState> getRollDiceMethod() {
    io.grpc.MethodDescriptor<dev.gustavoteixeira.models.Void, dev.gustavoteixeira.models.GameState> getRollDiceMethod;
    if ((getRollDiceMethod = GameServiceGrpc.getRollDiceMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getRollDiceMethod = GameServiceGrpc.getRollDiceMethod) == null) {
          GameServiceGrpc.getRollDiceMethod = getRollDiceMethod = 
              io.grpc.MethodDescriptor.<dev.gustavoteixeira.models.Void, dev.gustavoteixeira.models.GameState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GameService", "rollDice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.gustavoteixeira.models.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.gustavoteixeira.models.GameState.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("rollDice"))
                  .build();
          }
        }
     }
     return getRollDiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    return new GameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<dev.gustavoteixeira.models.Void> rollDice(
        io.grpc.stub.StreamObserver<dev.gustavoteixeira.models.GameState> responseObserver) {
      return asyncUnimplementedStreamingCall(getRollDiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRollDiceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                dev.gustavoteixeira.models.Void,
                dev.gustavoteixeira.models.GameState>(
                  this, METHODID_ROLL_DICE)))
          .build();
    }
  }

  /**
   */
  public static final class GameServiceStub extends io.grpc.stub.AbstractStub<GameServiceStub> {
    private GameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<dev.gustavoteixeira.models.Void> rollDice(
        io.grpc.stub.StreamObserver<dev.gustavoteixeira.models.GameState> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRollDiceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GameServiceBlockingStub extends io.grpc.stub.AbstractStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class GameServiceFutureStub extends io.grpc.stub.AbstractStub<GameServiceFutureStub> {
    private GameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ROLL_DICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROLL_DICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.rollDice(
              (io.grpc.stub.StreamObserver<dev.gustavoteixeira.models.GameState>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.gustavoteixeira.models.GameServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getRollDiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
