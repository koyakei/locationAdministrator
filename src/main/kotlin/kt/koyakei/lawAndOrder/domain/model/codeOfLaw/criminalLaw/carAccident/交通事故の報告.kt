package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class 交通事故の報告(
    val identifier: Identifier,
    //関係車両　通行者りすと、
    val 交通事故当事者List: List<交通事故当事者>,
    ) {
    /**
     * 当事者と関係者（証人)で立場が移動する場合や２つの役割を持っている場合はどうするのか？
     *
     */
    @JvmInline
    value class 交通事故当事者(val personInLawIdentifier: PersonInLaw.Identifier)

    @JvmInline
    value class Identifier(val long: Long)
}

