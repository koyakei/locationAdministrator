package kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model

import kt.koyakei.naturalBaseRegistry.Item

/**
 * 一つの船に何本ねじがついてるか　みたいな value object だから　identifier はいらない
 */
class 従属する要素の実体(
    val amount: Amount,
    val propertyItemIdentifier: Item.Identifier
) {
    /**
     * 個数
     */
    @JvmInline
    value class Amount(val long: Long)
}