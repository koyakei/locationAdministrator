package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.Road

data class 交通事故の報告(
    val identifier: Identifier,
    //関係車両　通行者りすと、
    val 交通事故当事者List: List<交通事故当事者>,
    val velocity: Velocity,
    val 事故現場Identifier: Road.Identifier
    ) {

    @JvmInline
    value class Velocity(val long: Long)
    /**
     * 当事者と関係者（証人)で立場が移動する場合や２つの役割を持っている場合はどうするのか？
     *
     */
    @JvmInline
    value class 交通事故当事者(val personInLawIdentifier: PersonInLaw.Identifier)

    @JvmInline
    value class Identifier(val long: Long)
}

