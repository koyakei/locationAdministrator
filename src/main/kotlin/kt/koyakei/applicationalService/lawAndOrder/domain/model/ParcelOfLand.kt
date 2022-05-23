package kt.koyakei.applicationalService.lawAndOrder.domain.model

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.Location
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 一筆単位
 * 複数の住所を持つ土地がある。玄関の位置を住所にするのが普通なのだが、適当な場合がある。
 *
 */
data class ParcelOfLand(
    val identifierList: List<Location.Identifier>,
    val ownerIdentifier: PersonInLaw.Identifier
)
