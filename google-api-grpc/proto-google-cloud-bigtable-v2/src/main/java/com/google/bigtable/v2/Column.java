// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 * <pre>
 * Specifies (some of) the contents of a single row/column intersection of a
 * table.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.Column}
 */
public  final class Column extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.Column)
    ColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Column.newBuilder() to construct.
  private Column(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Column() {
    qualifier_ = com.google.protobuf.ByteString.EMPTY;
    cells_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Column(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            qualifier_ = input.readBytes();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              cells_ = new java.util.ArrayList<com.google.bigtable.v2.Cell>();
              mutable_bitField0_ |= 0x00000002;
            }
            cells_.add(
                input.readMessage(com.google.bigtable.v2.Cell.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        cells_ = java.util.Collections.unmodifiableList(cells_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Column_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Column_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.Column.class, com.google.bigtable.v2.Column.Builder.class);
  }

  private int bitField0_;
  public static final int QUALIFIER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString qualifier_;
  /**
   * <pre>
   * The unique key which identifies this column within its family. This is the
   * same key that's used to identify the column in, for example, a RowFilter
   * which sets its `column_qualifier_regex_filter` field.
   * May contain any byte string, including the empty string, up to 16kiB in
   * length.
   * </pre>
   *
   * <code>bytes qualifier = 1;</code>
   */
  public com.google.protobuf.ByteString getQualifier() {
    return qualifier_;
  }

  public static final int CELLS_FIELD_NUMBER = 2;
  private java.util.List<com.google.bigtable.v2.Cell> cells_;
  /**
   * <pre>
   * Must not be empty. Sorted in order of decreasing "timestamp_micros".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
   */
  public java.util.List<com.google.bigtable.v2.Cell> getCellsList() {
    return cells_;
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of decreasing "timestamp_micros".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
   */
  public java.util.List<? extends com.google.bigtable.v2.CellOrBuilder> 
      getCellsOrBuilderList() {
    return cells_;
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of decreasing "timestamp_micros".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
   */
  public int getCellsCount() {
    return cells_.size();
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of decreasing "timestamp_micros".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
   */
  public com.google.bigtable.v2.Cell getCells(int index) {
    return cells_.get(index);
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of decreasing "timestamp_micros".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
   */
  public com.google.bigtable.v2.CellOrBuilder getCellsOrBuilder(
      int index) {
    return cells_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!qualifier_.isEmpty()) {
      output.writeBytes(1, qualifier_);
    }
    for (int i = 0; i < cells_.size(); i++) {
      output.writeMessage(2, cells_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!qualifier_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, qualifier_);
    }
    for (int i = 0; i < cells_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, cells_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.Column)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.Column other = (com.google.bigtable.v2.Column) obj;

    boolean result = true;
    result = result && getQualifier()
        .equals(other.getQualifier());
    result = result && getCellsList()
        .equals(other.getCellsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + QUALIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getQualifier().hashCode();
    if (getCellsCount() > 0) {
      hash = (37 * hash) + CELLS_FIELD_NUMBER;
      hash = (53 * hash) + getCellsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.Column parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Column parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Column parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Column parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Column parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Column parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.v2.Column prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Specifies (some of) the contents of a single row/column intersection of a
   * table.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.Column}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.Column)
      com.google.bigtable.v2.ColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Column_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Column_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.Column.class, com.google.bigtable.v2.Column.Builder.class);
    }

    // Construct using com.google.bigtable.v2.Column.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCellsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      qualifier_ = com.google.protobuf.ByteString.EMPTY;

      if (cellsBuilder_ == null) {
        cells_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        cellsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Column_descriptor;
    }

    public com.google.bigtable.v2.Column getDefaultInstanceForType() {
      return com.google.bigtable.v2.Column.getDefaultInstance();
    }

    public com.google.bigtable.v2.Column build() {
      com.google.bigtable.v2.Column result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v2.Column buildPartial() {
      com.google.bigtable.v2.Column result = new com.google.bigtable.v2.Column(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.qualifier_ = qualifier_;
      if (cellsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          cells_ = java.util.Collections.unmodifiableList(cells_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.cells_ = cells_;
      } else {
        result.cells_ = cellsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.Column) {
        return mergeFrom((com.google.bigtable.v2.Column)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.Column other) {
      if (other == com.google.bigtable.v2.Column.getDefaultInstance()) return this;
      if (other.getQualifier() != com.google.protobuf.ByteString.EMPTY) {
        setQualifier(other.getQualifier());
      }
      if (cellsBuilder_ == null) {
        if (!other.cells_.isEmpty()) {
          if (cells_.isEmpty()) {
            cells_ = other.cells_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCellsIsMutable();
            cells_.addAll(other.cells_);
          }
          onChanged();
        }
      } else {
        if (!other.cells_.isEmpty()) {
          if (cellsBuilder_.isEmpty()) {
            cellsBuilder_.dispose();
            cellsBuilder_ = null;
            cells_ = other.cells_;
            bitField0_ = (bitField0_ & ~0x00000002);
            cellsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCellsFieldBuilder() : null;
          } else {
            cellsBuilder_.addAllMessages(other.cells_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v2.Column parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.Column) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString qualifier_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The unique key which identifies this column within its family. This is the
     * same key that's used to identify the column in, for example, a RowFilter
     * which sets its `column_qualifier_regex_filter` field.
     * May contain any byte string, including the empty string, up to 16kiB in
     * length.
     * </pre>
     *
     * <code>bytes qualifier = 1;</code>
     */
    public com.google.protobuf.ByteString getQualifier() {
      return qualifier_;
    }
    /**
     * <pre>
     * The unique key which identifies this column within its family. This is the
     * same key that's used to identify the column in, for example, a RowFilter
     * which sets its `column_qualifier_regex_filter` field.
     * May contain any byte string, including the empty string, up to 16kiB in
     * length.
     * </pre>
     *
     * <code>bytes qualifier = 1;</code>
     */
    public Builder setQualifier(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      qualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique key which identifies this column within its family. This is the
     * same key that's used to identify the column in, for example, a RowFilter
     * which sets its `column_qualifier_regex_filter` field.
     * May contain any byte string, including the empty string, up to 16kiB in
     * length.
     * </pre>
     *
     * <code>bytes qualifier = 1;</code>
     */
    public Builder clearQualifier() {
      
      qualifier_ = getDefaultInstance().getQualifier();
      onChanged();
      return this;
    }

    private java.util.List<com.google.bigtable.v2.Cell> cells_ =
      java.util.Collections.emptyList();
    private void ensureCellsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        cells_ = new java.util.ArrayList<com.google.bigtable.v2.Cell>(cells_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.v2.Cell, com.google.bigtable.v2.Cell.Builder, com.google.bigtable.v2.CellOrBuilder> cellsBuilder_;

    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public java.util.List<com.google.bigtable.v2.Cell> getCellsList() {
      if (cellsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cells_);
      } else {
        return cellsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public int getCellsCount() {
      if (cellsBuilder_ == null) {
        return cells_.size();
      } else {
        return cellsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public com.google.bigtable.v2.Cell getCells(int index) {
      if (cellsBuilder_ == null) {
        return cells_.get(index);
      } else {
        return cellsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder setCells(
        int index, com.google.bigtable.v2.Cell value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.set(index, value);
        onChanged();
      } else {
        cellsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder setCells(
        int index, com.google.bigtable.v2.Cell.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.set(index, builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder addCells(com.google.bigtable.v2.Cell value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.add(value);
        onChanged();
      } else {
        cellsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder addCells(
        int index, com.google.bigtable.v2.Cell value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.add(index, value);
        onChanged();
      } else {
        cellsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder addCells(
        com.google.bigtable.v2.Cell.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.add(builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder addCells(
        int index, com.google.bigtable.v2.Cell.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.add(index, builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder addAllCells(
        java.lang.Iterable<? extends com.google.bigtable.v2.Cell> values) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cells_);
        onChanged();
      } else {
        cellsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder clearCells() {
      if (cellsBuilder_ == null) {
        cells_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        cellsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public Builder removeCells(int index) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.remove(index);
        onChanged();
      } else {
        cellsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public com.google.bigtable.v2.Cell.Builder getCellsBuilder(
        int index) {
      return getCellsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public com.google.bigtable.v2.CellOrBuilder getCellsOrBuilder(
        int index) {
      if (cellsBuilder_ == null) {
        return cells_.get(index);  } else {
        return cellsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public java.util.List<? extends com.google.bigtable.v2.CellOrBuilder> 
         getCellsOrBuilderList() {
      if (cellsBuilder_ != null) {
        return cellsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cells_);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public com.google.bigtable.v2.Cell.Builder addCellsBuilder() {
      return getCellsFieldBuilder().addBuilder(
          com.google.bigtable.v2.Cell.getDefaultInstance());
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public com.google.bigtable.v2.Cell.Builder addCellsBuilder(
        int index) {
      return getCellsFieldBuilder().addBuilder(
          index, com.google.bigtable.v2.Cell.getDefaultInstance());
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of decreasing "timestamp_micros".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Cell cells = 2;</code>
     */
    public java.util.List<com.google.bigtable.v2.Cell.Builder> 
         getCellsBuilderList() {
      return getCellsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.v2.Cell, com.google.bigtable.v2.Cell.Builder, com.google.bigtable.v2.CellOrBuilder> 
        getCellsFieldBuilder() {
      if (cellsBuilder_ == null) {
        cellsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.bigtable.v2.Cell, com.google.bigtable.v2.Cell.Builder, com.google.bigtable.v2.CellOrBuilder>(
                cells_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        cells_ = null;
      }
      return cellsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.Column)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.Column)
  private static final com.google.bigtable.v2.Column DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.Column();
  }

  public static com.google.bigtable.v2.Column getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Column>
      PARSER = new com.google.protobuf.AbstractParser<Column>() {
    public Column parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Column(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Column> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Column> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v2.Column getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
