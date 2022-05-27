package kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.service

import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.GeneralItemFeature
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.GeneralServiceItemFeature
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.従属する要素の実体

class SkiInstructionService(
    override val identifier: Item.Identifier,
    override val 従属する要素の実体List: List<従属する要素の実体>,
    override val 分類された要素v: GeneralItemFeature.分類された要素,
    override val name: String,
    override val generalItemFeatureIdentifier: Item.Identifier,
) : GeneralServiceItemFeature {
}