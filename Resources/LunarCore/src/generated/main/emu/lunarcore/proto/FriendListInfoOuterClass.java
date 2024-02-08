// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class FriendListInfoOuterClass {
  /**
   * Protobuf type {@code FriendListInfo}
   */
  public static final class FriendListInfo extends ProtoMessage<FriendListInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     */
    private final SimpleInfoOuterClass.SimpleInfo simpleInfo = SimpleInfoOuterClass.SimpleInfo.newInstance();

    private FriendListInfo() {
    }

    /**
     * @return a new empty instance of {@code FriendListInfo}
     */
    public static FriendListInfo newInstance() {
      return new FriendListInfo();
    }

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     * @return whether the simpleInfo field is set
     */
    public boolean hasSimpleInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     * @return this
     */
    public FriendListInfo clearSimpleInfo() {
      bitField0_ &= ~0x00000001;
      simpleInfo.clear();
      return this;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSimpleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SimpleInfoOuterClass.SimpleInfo getSimpleInfo() {
      return simpleInfo;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SimpleInfoOuterClass.SimpleInfo getMutableSimpleInfo() {
      bitField0_ |= 0x00000001;
      return simpleInfo;
    }

    /**
     * <code>optional .SimpleInfo simple_info = 10;</code>
     * @param value the simpleInfo to set
     * @return this
     */
    public FriendListInfo setSimpleInfo(final SimpleInfoOuterClass.SimpleInfo value) {
      bitField0_ |= 0x00000001;
      simpleInfo.copyFrom(value);
      return this;
    }

    @Override
    public FriendListInfo copyFrom(final FriendListInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        simpleInfo.copyFrom(other.simpleInfo);
      }
      return this;
    }

    @Override
    public FriendListInfo mergeFrom(final FriendListInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSimpleInfo()) {
        getMutableSimpleInfo().mergeFrom(other.simpleInfo);
      }
      return this;
    }

    @Override
    public FriendListInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      simpleInfo.clear();
      return this;
    }

    @Override
    public FriendListInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      simpleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof FriendListInfo)) {
        return false;
      }
      FriendListInfo other = (FriendListInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasSimpleInfo() || simpleInfo.equals(other.simpleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(simpleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(simpleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FriendListInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 82: {
            // simpleInfo
            input.readMessage(simpleInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.simpleInfo, simpleInfo);
      }
      output.endObject();
    }

    @Override
    public FriendListInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1431903872:
          case -1419171045: {
            if (input.isAtField(FieldNames.simpleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(simpleInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public FriendListInfo clone() {
      return new FriendListInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FriendListInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), data).checkInitialized();
    }

    public static FriendListInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), input).checkInitialized();
    }

    public static FriendListInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FriendListInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating FriendListInfo messages
     */
    public static MessageFactory<FriendListInfo> getFactory() {
      return FriendListInfoFactory.INSTANCE;
    }

    private enum FriendListInfoFactory implements MessageFactory<FriendListInfo> {
      INSTANCE;

      @Override
      public FriendListInfo create() {
        return FriendListInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName simpleInfo = FieldName.forField("simpleInfo", "simple_info");
    }
  }
}
