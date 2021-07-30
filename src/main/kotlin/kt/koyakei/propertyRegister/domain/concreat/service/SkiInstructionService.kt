package kt.koyakei.propertyRegister.domain.concreat.service

import kt.koyakei.propertyRegister.domain.GeneralItemFeature
import kt.koyakei.propertyRegister.domain.GeneralServiceItemFeature
import kt.koyakei.propertyRegister.domain.ServiceProvider
import kt.koyakei.propertyRegister.domain.従属する要素の実体

class SkiInstructionService(
    override val identifier: GeneralItemFeature.Identifier,
    override val 従属する要素の実体List: List<従属する要素の実体>,
    override val 分類された要素v: GeneralItemFeature.分類された要素,
    override val name: String,
    override val serviceProvider: ServiceProvider
) : GeneralServiceItemFeature {
}