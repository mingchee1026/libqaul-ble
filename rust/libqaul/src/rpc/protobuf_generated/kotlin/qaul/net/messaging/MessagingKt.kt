//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/messaging/messaging.proto

package qaul.net.messaging;

@kotlin.jvm.JvmName("-initializemessaging")
inline fun messaging(block: qaul.net.messaging.MessagingKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.Messaging =
  qaul.net.messaging.MessagingKt.Dsl._create(qaul.net.messaging.MessagingOuterClass.Messaging.newBuilder()).apply { block() }._build()
object MessagingKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.messaging.MessagingOuterClass.Messaging.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.messaging.MessagingOuterClass.Messaging.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.messaging.MessagingOuterClass.Messaging = _builder.build()

    /**
     * <pre>
     * confirm chat message
     * </pre>
     *
     * <code>.qaul.net.messaging.Confirmation confirmation_message = 1;</code>
     */
    var confirmationMessage: qaul.net.messaging.MessagingOuterClass.Confirmation
      @JvmName("getConfirmationMessage")
      get() = _builder.getConfirmationMessage()
      @JvmName("setConfirmationMessage")
      set(value) {
        _builder.setConfirmationMessage(value)
      }
    /**
     * <pre>
     * confirm chat message
     * </pre>
     *
     * <code>.qaul.net.messaging.Confirmation confirmation_message = 1;</code>
     */
    fun clearConfirmationMessage() {
      _builder.clearConfirmationMessage()
    }
    /**
     * <pre>
     * confirm chat message
     * </pre>
     *
     * <code>.qaul.net.messaging.Confirmation confirmation_message = 1;</code>
     * @return Whether the confirmationMessage field is set.
     */
    fun hasConfirmationMessage(): kotlin.Boolean {
      return _builder.hasConfirmationMessage()
    }

    /**
     * <pre>
     * dtn response message
     * </pre>
     *
     * <code>.qaul.net.messaging.DtnResponse dtn_response = 2;</code>
     */
    var dtnResponse: qaul.net.messaging.MessagingOuterClass.DtnResponse
      @JvmName("getDtnResponse")
      get() = _builder.getDtnResponse()
      @JvmName("setDtnResponse")
      set(value) {
        _builder.setDtnResponse(value)
      }
    /**
     * <pre>
     * dtn response message
     * </pre>
     *
     * <code>.qaul.net.messaging.DtnResponse dtn_response = 2;</code>
     */
    fun clearDtnResponse() {
      _builder.clearDtnResponse()
    }
    /**
     * <pre>
     * dtn response message
     * </pre>
     *
     * <code>.qaul.net.messaging.DtnResponse dtn_response = 2;</code>
     * @return Whether the dtnResponse field is set.
     */
    fun hasDtnResponse(): kotlin.Boolean {
      return _builder.hasDtnResponse()
    }

    /**
     * <pre>
     * crypto service
     * </pre>
     *
     * <code>.qaul.net.messaging.CryptoService crypto_service = 3;</code>
     */
    var cryptoService: qaul.net.messaging.MessagingOuterClass.CryptoService
      @JvmName("getCryptoService")
      get() = _builder.getCryptoService()
      @JvmName("setCryptoService")
      set(value) {
        _builder.setCryptoService(value)
      }
    /**
     * <pre>
     * crypto service
     * </pre>
     *
     * <code>.qaul.net.messaging.CryptoService crypto_service = 3;</code>
     */
    fun clearCryptoService() {
      _builder.clearCryptoService()
    }
    /**
     * <pre>
     * crypto service
     * </pre>
     *
     * <code>.qaul.net.messaging.CryptoService crypto_service = 3;</code>
     * @return Whether the cryptoService field is set.
     */
    fun hasCryptoService(): kotlin.Boolean {
      return _builder.hasCryptoService()
    }

    /**
     * <pre>
     * rtc stream
     * </pre>
     *
     * <code>.qaul.net.messaging.RtcStreamMessage rtc_stream_message = 4;</code>
     */
    var rtcStreamMessage: qaul.net.messaging.MessagingOuterClass.RtcStreamMessage
      @JvmName("getRtcStreamMessage")
      get() = _builder.getRtcStreamMessage()
      @JvmName("setRtcStreamMessage")
      set(value) {
        _builder.setRtcStreamMessage(value)
      }
    /**
     * <pre>
     * rtc stream
     * </pre>
     *
     * <code>.qaul.net.messaging.RtcStreamMessage rtc_stream_message = 4;</code>
     */
    fun clearRtcStreamMessage() {
      _builder.clearRtcStreamMessage()
    }
    /**
     * <pre>
     * rtc stream
     * </pre>
     *
     * <code>.qaul.net.messaging.RtcStreamMessage rtc_stream_message = 4;</code>
     * @return Whether the rtcStreamMessage field is set.
     */
    fun hasRtcStreamMessage(): kotlin.Boolean {
      return _builder.hasRtcStreamMessage()
    }

    /**
     * <pre>
     * group invite messages
     * </pre>
     *
     * <code>.qaul.net.messaging.GroupInviteMessage group_invite_message = 5;</code>
     */
    var groupInviteMessage: qaul.net.messaging.MessagingOuterClass.GroupInviteMessage
      @JvmName("getGroupInviteMessage")
      get() = _builder.getGroupInviteMessage()
      @JvmName("setGroupInviteMessage")
      set(value) {
        _builder.setGroupInviteMessage(value)
      }
    /**
     * <pre>
     * group invite messages
     * </pre>
     *
     * <code>.qaul.net.messaging.GroupInviteMessage group_invite_message = 5;</code>
     */
    fun clearGroupInviteMessage() {
      _builder.clearGroupInviteMessage()
    }
    /**
     * <pre>
     * group invite messages
     * </pre>
     *
     * <code>.qaul.net.messaging.GroupInviteMessage group_invite_message = 5;</code>
     * @return Whether the groupInviteMessage field is set.
     */
    fun hasGroupInviteMessage(): kotlin.Boolean {
      return _builder.hasGroupInviteMessage()
    }

    /**
     * <pre>
     * common message
     * </pre>
     *
     * <code>.qaul.net.messaging.CommonMessage common_message = 6;</code>
     */
    var commonMessage: qaul.net.messaging.MessagingOuterClass.CommonMessage
      @JvmName("getCommonMessage")
      get() = _builder.getCommonMessage()
      @JvmName("setCommonMessage")
      set(value) {
        _builder.setCommonMessage(value)
      }
    /**
     * <pre>
     * common message
     * </pre>
     *
     * <code>.qaul.net.messaging.CommonMessage common_message = 6;</code>
     */
    fun clearCommonMessage() {
      _builder.clearCommonMessage()
    }
    /**
     * <pre>
     * common message
     * </pre>
     *
     * <code>.qaul.net.messaging.CommonMessage common_message = 6;</code>
     * @return Whether the commonMessage field is set.
     */
    fun hasCommonMessage(): kotlin.Boolean {
      return _builder.hasCommonMessage()
    }
    val messageCase: qaul.net.messaging.MessagingOuterClass.Messaging.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.messaging.MessagingOuterClass.Messaging.copy(block: qaul.net.messaging.MessagingKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.Messaging =
  qaul.net.messaging.MessagingKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.confirmationMessageOrNull: qaul.net.messaging.MessagingOuterClass.Confirmation?
  get() = if (hasConfirmationMessage()) getConfirmationMessage() else null

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.dtnResponseOrNull: qaul.net.messaging.MessagingOuterClass.DtnResponse?
  get() = if (hasDtnResponse()) getDtnResponse() else null

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.cryptoServiceOrNull: qaul.net.messaging.MessagingOuterClass.CryptoService?
  get() = if (hasCryptoService()) getCryptoService() else null

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.rtcStreamMessageOrNull: qaul.net.messaging.MessagingOuterClass.RtcStreamMessage?
  get() = if (hasRtcStreamMessage()) getRtcStreamMessage() else null

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.groupInviteMessageOrNull: qaul.net.messaging.MessagingOuterClass.GroupInviteMessage?
  get() = if (hasGroupInviteMessage()) getGroupInviteMessage() else null

val qaul.net.messaging.MessagingOuterClass.MessagingOrBuilder.commonMessageOrNull: qaul.net.messaging.MessagingOuterClass.CommonMessage?
  get() = if (hasCommonMessage()) getCommonMessage() else null
