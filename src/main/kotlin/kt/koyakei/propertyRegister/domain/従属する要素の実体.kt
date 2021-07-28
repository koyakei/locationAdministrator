package kt.koyakei.propertyRegister.domain

import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeNode

/**
 * 一つの船に何本ねじがついてるか　みたいな value object だから　identifier はいらない
 */
class 従属する要素の実体(
                val amount: Amount,
val PropertyItemIdentifier: PropertyItem.Identifier) {
    /**
     * 個数
     */
    @JvmInline
    value class Amount(val long: Long)
}