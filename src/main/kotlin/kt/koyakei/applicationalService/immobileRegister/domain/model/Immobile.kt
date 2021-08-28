package kt.koyakei.applicationalService.immobileRegister.domain.model

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.Area
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 複数の住所を持つ土地がある。　玄関の位置を住所にするのが普通なのだが、適当な場合がある。
 * TODO 抵当がたくさん入っている場合 抵当がつけられる道産もあるからね。
 */
data class Immobile(
    val identifier: Identifier,
    val areaIdentifierList: List<Area.AreaIdentifier>,
    val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange,
    val ownerIdentifier: PersonInLaw.Identifier
){

    @JvmInline
    value class Identifier(val long: Long)
}

