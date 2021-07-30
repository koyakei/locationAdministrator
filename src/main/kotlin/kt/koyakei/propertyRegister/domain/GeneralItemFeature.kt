package kt.koyakei.propertyRegister.domain

import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeVertex

interface GeneralItemFeature {
    val identifier: Identifier
    val 従属する要素の実体List: List<従属する要素の実体>
    val 分類された要素v: 分類された要素
    val name: String
    @JvmInline
    value class 分類された要素(val propertyTreeNodeIdentifier: PropertyTreeVertex.Identifier)

    @JvmInline
    value class Identifier(val Long: Long)
}