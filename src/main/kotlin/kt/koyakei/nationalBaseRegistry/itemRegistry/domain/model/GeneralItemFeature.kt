package kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model

import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeVertex
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item

interface GeneralItemFeature {
    val identifier: Item.Identifier
    val 従属する要素の実体List: List<従属する要素の実体>
    val 分類された要素v: 分類された要素
    val name: String
    @JvmInline
    value class 分類された要素(val propertyTreeNodeIdentifier: ItemTreeVertex.Identifier)


}