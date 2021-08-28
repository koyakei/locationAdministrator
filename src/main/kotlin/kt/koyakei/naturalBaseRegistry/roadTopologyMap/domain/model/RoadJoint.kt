package kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model

/**
 * 道路元標
 */
data class RoadJoint(
    val identifier: Identifier,
    val geometricPointIdentifier: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint.Identifier
){
    @JvmInline
    value class Identifier(val long: Long)
}
