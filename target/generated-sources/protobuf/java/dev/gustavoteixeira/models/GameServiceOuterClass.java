// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-service.proto

package dev.gustavoteixeira.models;

public final class GameServiceOuterClass {
  private GameServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Void_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022game-service.proto\"\006\n\004Void\"=\n\tGameStat" +
      "e\022\027\n\017client_position\030\001 \001(\005\022\027\n\017server_pos" +
      "ition\030\002 \001(\00520\n\013GameService\022!\n\010rollDice\022\005" +
      ".Void\032\n.GameState(\0010\001B\036\n\032dev.gustavoteix" +
      "eira.modelsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Void_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Void_descriptor,
        new java.lang.String[] { });
    internal_static_GameState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GameState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameState_descriptor,
        new java.lang.String[] { "ClientPosition", "ServerPosition", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}