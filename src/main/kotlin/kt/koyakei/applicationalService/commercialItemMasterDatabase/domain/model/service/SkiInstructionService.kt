package kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.service

import kt.koyakei.baseRegistory.itemIdentifierRegister.domain.model.GeneralItemFeature
import kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.GeneralServiceItemFeature
import kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.従属する要素の実体

class SkiInstructionService(
    override val identifier: GeneralItemFeature.Identifier,
    override val 従属する要素の実体List: List<従属する要素の実体>,
    override val 分類された要素v: GeneralItemFeature.分類された要素,
    override val name: String,
    override val generalItemFeatureIdentifier: GeneralItemFeature.Identifier,
) : GeneralServiceItemFeature {
}