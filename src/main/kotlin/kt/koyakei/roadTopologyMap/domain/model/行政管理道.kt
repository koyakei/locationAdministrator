package kt.koyakei.roadTopologyMap.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class 行政管理道(
    override val identifier: Road.Identifier,
    override val name: Road.Name,
    override val startedFrom: Road.StartedFrom,
    override val endTo: Road.EndTo,
    val owner: Owner
): Road{
    @JvmInline
    value class Identifier(val long: Long)
    @JvmInline
    value class Owner(val personInLawIdentifier: PersonInLaw.Identifier)
}
