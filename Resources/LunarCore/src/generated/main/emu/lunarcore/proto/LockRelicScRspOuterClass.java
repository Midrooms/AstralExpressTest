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

public final class LockRelicScRspOuterClass {
  /**
   * Protobuf type {@code LockRelicScRsp}
   */
  public static final class LockRelicScRsp extends ProtoMessage<LockRelicScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 relic_unique_id = 4;</code>
     */
    private int relicUniqueId;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    private LockRelicScRsp() {
    }

    /**
     * @return a new empty instance of {@code LockRelicScRsp}
     */
    public static LockRelicScRsp newInstance() {
      return new LockRelicScRsp();
    }

    /**
     * <code>optional uint32 relic_unique_id = 4;</code>
     * @return whether the relicUniqueId field is set
     */
    public boolean hasRelicUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 relic_unique_id = 4;</code>
     * @return this
     */
    public LockRelicScRsp clearRelicUniqueId() {
      bitField0_ &= ~0x00000001;
      relicUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 relic_unique_id = 4;</code>
     * @return the relicUniqueId
     */
    public int getRelicUniqueId() {
      return relicUniqueId;
    }

    /**
     * <code>optional uint32 relic_unique_id = 4;</code>
     * @param value the relicUniqueId to set
     * @return this
     */
    public LockRelicScRsp setRelicUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      relicUniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public LockRelicScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public LockRelicScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public LockRelicScRsp copyFrom(final LockRelicScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        relicUniqueId = other.relicUniqueId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public LockRelicScRsp mergeFrom(final LockRelicScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRelicUniqueId()) {
        setRelicUniqueId(other.relicUniqueId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public LockRelicScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      relicUniqueId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public LockRelicScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LockRelicScRsp)) {
        return false;
      }
      LockRelicScRsp other = (LockRelicScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRelicUniqueId() || relicUniqueId == other.relicUniqueId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LockRelicScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // relicUniqueId
            relicUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.relicUniqueId, relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public LockRelicScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1966200481:
          case 49648253: {
            if (input.isAtField(FieldNames.relicUniqueId)) {
              if (!input.trySkipNullValue()) {
                relicUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public LockRelicScRsp clone() {
      return new LockRelicScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LockRelicScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LockRelicScRsp(), data).checkInitialized();
    }

    public static LockRelicScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockRelicScRsp(), input).checkInitialized();
    }

    public static LockRelicScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockRelicScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating LockRelicScRsp messages
     */
    public static MessageFactory<LockRelicScRsp> getFactory() {
      return LockRelicScRspFactory.INSTANCE;
    }

    private enum LockRelicScRspFactory implements MessageFactory<LockRelicScRsp> {
      INSTANCE;

      @Override
      public LockRelicScRsp create() {
        return LockRelicScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName relicUniqueId = FieldName.forField("relicUniqueId", "relic_unique_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
