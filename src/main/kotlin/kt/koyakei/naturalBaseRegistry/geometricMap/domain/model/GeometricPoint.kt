package kt.koyakei.naturalBaseRegistry.geometricMap.domain.model

/**
 * 平面のみを考慮する
 */
data class GeometricPoint(
    val identifier: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint.Identifier,
    val longitude: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint.Longitude, val latitude: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint.Latitude
){
    @JvmInline
    value class Identifier(val longitude: Long,)
    @JvmInline
    value class Longitude(val longitude: Long,)

    @JvmInline
    value class Latitude(val latitude: Long,)
}

