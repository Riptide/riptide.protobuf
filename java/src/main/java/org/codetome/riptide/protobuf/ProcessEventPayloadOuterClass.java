// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data/process_event_payload.proto

package org.codetome.riptide.protobuf;

public final class ProcessEventPayloadOuterClass {
  private ProcessEventPayloadOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_ProcessEventPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_ProcessEventPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_ProcessEventPayload_ExtraDataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_ProcessEventPayload_ExtraDataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n data/process_event_payload.proto\022\004data" +
      "\032\030data/process_state.proto\"\301\001\n\023ProcessEv" +
      "entPayload\022\017\n\007message\030\001 \001(\t\022)\n\rprocess_s" +
      "tate\030\002 \001(\0162\022.data.ProcessState\022<\n\nextra_" +
      "data\030\003 \003(\0132(.data.ProcessEventPayload.Ex" +
      "traDataEntry\0320\n\016ExtraDataEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B#\n\035org.codetome.r" +
      "iptide.protobufH\001P\001b\006proto3"
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
          org.codetome.riptide.protobuf.ProcessStateOuterClass.getDescriptor(),
        }, assigner);
    internal_static_data_ProcessEventPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_ProcessEventPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_ProcessEventPayload_descriptor,
        new java.lang.String[] { "Message", "ProcessState", "ExtraData", });
    internal_static_data_ProcessEventPayload_ExtraDataEntry_descriptor =
      internal_static_data_ProcessEventPayload_descriptor.getNestedTypes().get(0);
    internal_static_data_ProcessEventPayload_ExtraDataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_ProcessEventPayload_ExtraDataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.codetome.riptide.protobuf.ProcessStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
