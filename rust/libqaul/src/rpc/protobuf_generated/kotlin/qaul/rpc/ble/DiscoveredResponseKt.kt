//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_rpc.proto

package qaul.rpc.ble;

@kotlin.jvm.JvmName("-initializediscoveredResponse")
inline fun discoveredResponse(block: qaul.rpc.ble.DiscoveredResponseKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.DiscoveredResponse =
  qaul.rpc.ble.DiscoveredResponseKt.Dsl._create(qaul.rpc.ble.BleRpc.DiscoveredResponse.newBuilder()).apply { block() }._build()
object DiscoveredResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.ble.BleRpc.DiscoveredResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.ble.BleRpc.DiscoveredResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.ble.BleRpc.DiscoveredResponse = _builder.build()

    /**
     * <pre>
     * number of nodes in discovery table
     * </pre>
     *
     * <code>uint32 nodes_count = 1;</code>
     */
    var nodesCount: kotlin.Int
      @JvmName("getNodesCount")
      get() = _builder.getNodesCount()
      @JvmName("setNodesCount")
      set(value) {
        _builder.setNodesCount(value)
      }
    /**
     * <pre>
     * number of nodes in discovery table
     * </pre>
     *
     * <code>uint32 nodes_count = 1;</code>
     */
    fun clearNodesCount() {
      _builder.clearNodesCount()
    }

    /**
     * <pre>
     * number of nodes in to_confirm table
     * </pre>
     *
     * <code>uint32 to_confirm_count = 2;</code>
     */
    var toConfirmCount: kotlin.Int
      @JvmName("getToConfirmCount")
      get() = _builder.getToConfirmCount()
      @JvmName("setToConfirmCount")
      set(value) {
        _builder.setToConfirmCount(value)
      }
    /**
     * <pre>
     * number of nodes in to_confirm table
     * </pre>
     *
     * <code>uint32 to_confirm_count = 2;</code>
     */
    fun clearToConfirmCount() {
      _builder.clearToConfirmCount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.ble.BleRpc.DiscoveredResponse.copy(block: qaul.rpc.ble.DiscoveredResponseKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.DiscoveredResponse =
  qaul.rpc.ble.DiscoveredResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
