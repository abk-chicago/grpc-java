// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

public interface SimpleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.testing.SimpleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .grpc.testing.PayloadType response_type = 1;</code>
   *
   * <pre>
   * Desired payload type in the response from the server.
   * If response_type is RANDOM, server randomly chooses one from other formats.
   * </pre>
   */
  int getResponseTypeValue();
  /**
   * <code>optional .grpc.testing.PayloadType response_type = 1;</code>
   *
   * <pre>
   * Desired payload type in the response from the server.
   * If response_type is RANDOM, server randomly chooses one from other formats.
   * </pre>
   */
  io.grpc.testing.PayloadType getResponseType();

  /**
   * <code>optional int32 response_size = 2;</code>
   *
   * <pre>
   * Desired payload size in the response from the server.
   * If response_type is COMPRESSABLE, this denotes the size before compression.
   * </pre>
   */
  int getResponseSize();

  /**
   * <code>optional .grpc.testing.Payload payload = 3;</code>
   *
   * <pre>
   * Optional input payload sent along with the request.
   * </pre>
   */
  boolean hasPayload();
  /**
   * <code>optional .grpc.testing.Payload payload = 3;</code>
   *
   * <pre>
   * Optional input payload sent along with the request.
   * </pre>
   */
  io.grpc.testing.Payload getPayload();
  /**
   * <code>optional .grpc.testing.Payload payload = 3;</code>
   *
   * <pre>
   * Optional input payload sent along with the request.
   * </pre>
   */
  io.grpc.testing.PayloadOrBuilder getPayloadOrBuilder();
}