package kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.GeneralItemFeature

/**
 * 一つの船に何本ねじがついてるか　みたいな value object だから　identifier はいらない
 */
class 従属する要素の実体(
    val amount: Amount,
    val propertyItemIdentifier: GeneralItemFeature.Identifier
) {
    /**
     * 個数
     */
    @JvmInline
    value class Amount(val long: Long)
}