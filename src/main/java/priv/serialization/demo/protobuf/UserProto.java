// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package priv.serialization.demo.protobuf;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserProtocolOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.UserProtocol)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 user_id = 1;</code>
     * @return The userId.
     */
    long getUserId();

    /**
     * <code>string user_name = 2;</code>
     * @return The userName.
     */
    String getUserName();
    /**
     * <code>string user_name = 2;</code>
     * @return The bytes for userName.
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    /**
     * <code>int32 age = 3;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code protocol.UserProtocol}
   */
  public  static final class UserProtocol extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.UserProtocol)
      UserProtocolOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserProtocol.newBuilder() to construct.
    private UserProtocol(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserProtocol() {
      userName_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserProtocol();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserProtocol(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
            case 8: {

              userId_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              userName_ = s;
              break;
            }
            case 24: {

              age_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return priv.serialization.demo.protobuf.UserProto.internal_static_protocol_UserProtocol_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return priv.serialization.demo.protobuf.UserProto.internal_static_protocol_UserProtocol_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              priv.serialization.demo.protobuf.UserProto.UserProtocol.class, priv.serialization.demo.protobuf.UserProto.UserProtocol.Builder.class);
    }

    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>int64 user_id = 1;</code>
     * @return The userId.
     */
    public long getUserId() {
      return userId_;
    }

    public static final int USER_NAME_FIELD_NUMBER = 2;
    private volatile Object userName_;
    /**
     * <code>string user_name = 2;</code>
     * @return The userName.
     */
    public String getUserName() {
      Object ref = userName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      }
    }
    /**
     * <code>string user_name = 2;</code>
     * @return The bytes for userName.
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>int32 age = 3;</code>
     * @return The age.
     */
    public int getAge() {
      return age_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0L) {
        output.writeInt64(1, userId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
      }
      if (age_ != 0) {
        output.writeInt32(3, age_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, userId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof priv.serialization.demo.protobuf.UserProto.UserProtocol)) {
        return super.equals(obj);
      }
      priv.serialization.demo.protobuf.UserProto.UserProtocol other = (priv.serialization.demo.protobuf.UserProto.UserProtocol) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (!getUserName()
          .equals(other.getUserName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getUserName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static priv.serialization.demo.protobuf.UserProto.UserProtocol parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(priv.serialization.demo.protobuf.UserProto.UserProtocol prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.UserProtocol}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.UserProtocol)
        priv.serialization.demo.protobuf.UserProto.UserProtocolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return priv.serialization.demo.protobuf.UserProto.internal_static_protocol_UserProtocol_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return priv.serialization.demo.protobuf.UserProto.internal_static_protocol_UserProtocol_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                priv.serialization.demo.protobuf.UserProto.UserProtocol.class, priv.serialization.demo.protobuf.UserProto.UserProtocol.Builder.class);
      }

      // Construct using priv.serialization.demo.protobuf.UserProto.UserProtocol.newBuilder()
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
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        userId_ = 0L;

        userName_ = "";

        age_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return priv.serialization.demo.protobuf.UserProto.internal_static_protocol_UserProtocol_descriptor;
      }

      @Override
      public priv.serialization.demo.protobuf.UserProto.UserProtocol getDefaultInstanceForType() {
        return priv.serialization.demo.protobuf.UserProto.UserProtocol.getDefaultInstance();
      }

      @Override
      public priv.serialization.demo.protobuf.UserProto.UserProtocol build() {
        priv.serialization.demo.protobuf.UserProto.UserProtocol result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public priv.serialization.demo.protobuf.UserProto.UserProtocol buildPartial() {
        priv.serialization.demo.protobuf.UserProto.UserProtocol result = new priv.serialization.demo.protobuf.UserProto.UserProtocol(this);
        result.userId_ = userId_;
        result.userName_ = userName_;
        result.age_ = age_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof priv.serialization.demo.protobuf.UserProto.UserProtocol) {
          return mergeFrom((priv.serialization.demo.protobuf.UserProto.UserProtocol)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(priv.serialization.demo.protobuf.UserProto.UserProtocol other) {
        if (other == priv.serialization.demo.protobuf.UserProto.UserProtocol.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (!other.getUserName().isEmpty()) {
          userName_ = other.userName_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        priv.serialization.demo.protobuf.UserProto.UserProtocol parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (priv.serialization.demo.protobuf.UserProto.UserProtocol) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long userId_ ;
      /**
       * <code>int64 user_id = 1;</code>
       * @return The userId.
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>int64 user_id = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 user_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private Object userName_ = "";
      /**
       * <code>string user_name = 2;</code>
       * @return The userName.
       */
      public String getUserName() {
        Object ref = userName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          userName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string user_name = 2;</code>
       * @return The bytes for userName.
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string user_name = 2;</code>
       * @param value The userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string user_name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserName() {
        
        userName_ = getDefaultInstance().getUserName();
        onChanged();
        return this;
      }
      /**
       * <code>string user_name = 2;</code>
       * @param value The bytes for userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userName_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 3;</code>
       * @return The age.
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 3;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.UserProtocol)
    }

    // @@protoc_insertion_point(class_scope:protocol.UserProtocol)
    private static final priv.serialization.demo.protobuf.UserProto.UserProtocol DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new priv.serialization.demo.protobuf.UserProto.UserProtocol();
    }

    public static priv.serialization.demo.protobuf.UserProto.UserProtocol getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserProtocol>
        PARSER = new com.google.protobuf.AbstractParser<UserProtocol>() {
      @Override
      public UserProtocol parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserProtocol(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserProtocol> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<UserProtocol> getParserForType() {
      return PARSER;
    }

    @Override
    public priv.serialization.demo.protobuf.UserProto.UserProtocol getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_UserProtocol_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_UserProtocol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nUser.proto\022\010protocol\"?\n\014UserProtocol\022\017" +
      "\n\007user_id\030\001 \001(\003\022\021\n\tuser_name\030\002 \001(\t\022\013\n\003ag" +
      "e\030\003 \001(\005B$\n\027priv.serialization.demoB\tUser" +
      "Protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protocol_UserProtocol_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_UserProtocol_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_UserProtocol_descriptor,
        new String[] { "UserId", "UserName", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}