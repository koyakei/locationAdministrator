package kt.koyakei.roadTopologyMap.domain.model

import kt.koyakei.geometricMap.domain.model.GeometricPoint

/**
 * 道路元標
 */
data class RoadJoint(
    val identifier: Identifier,
    val geometricPointIdentifier: GeometricPoint.Identifier
){
    @JvmInline
    value class Identifier(val long: Long)
}
