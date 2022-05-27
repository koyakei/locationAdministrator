package kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model

import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeVertex
import kt.koyakei.naturalBaseRegistry.Item

interface GeneralItemFeature {
    val identifier: Item.Identifier
    val 従属する要素の実体List: List<従属する要素の実体>
    val 分類された要素v: 分類された要素
    val name: String
    @JvmInline
    value class 分類された要素(val propertyTreeNodeIdentifier: ItemTreeVertex.Identifier)


}