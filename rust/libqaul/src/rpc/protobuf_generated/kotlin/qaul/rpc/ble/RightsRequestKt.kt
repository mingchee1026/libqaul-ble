//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_rpc.proto

package qaul.rpc.ble;

@kotlin.jvm.JvmName("-initializerightsRequest")
inline fun rightsRequest(block: qaul.rpc.ble.RightsRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.RightsRequest =
  qaul.rpc.ble.RightsRequestKt.Dsl._create(qaul.rpc.ble.BleRpc.RightsRequest.newBuilder()).apply { block() }._build()
object RightsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.ble.BleRpc.RightsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.ble.BleRpc.RightsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.ble.BleRpc.RightsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.ble.BleRpc.RightsRequest.copy(block: qaul.rpc.ble.RightsRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.RightsRequest =
  qaul.rpc.ble.RightsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

