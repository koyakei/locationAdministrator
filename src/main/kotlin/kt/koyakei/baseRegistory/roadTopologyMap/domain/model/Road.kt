package kt.koyakei.baseRegistory.roadTopologyMap.domain.model

interface Road{
    val identifier: Identifier
    val name: Name
    val startedFrom: StartedFrom
    val endTo: EndTo

    @JvmInline
    value class Identifier(val long: Long)
    @JvmInline
    value class Name(val string: String)
    @JvmInline
    value class StartedFrom(val roadJointIdentifier: Identifier)
    @JvmInline
    value class EndTo(val roadJointIdentifier: Identifier)
}
