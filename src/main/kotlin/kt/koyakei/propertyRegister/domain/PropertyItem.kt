package kt.koyakei.propertyRegister.domain

import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeVertex

/**
 * 複数のつりーを格納
 */
interface PropertyItem{
    val identifier: Identifier
    val 従属する要素の実体List: List<従属する要素の実体>
    val 分類された要素v: 分類された要素
    val name: String
    val maker: Maker
    @JvmInline
    value class 分類された要素(val propertyTreeNodeIdentifier: PropertyTreeVertex.Identifier)

    @JvmInline
    value class Identifier(val Long: Long)
}