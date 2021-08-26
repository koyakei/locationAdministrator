package kt.koyakei.baseRegistory.geometricMap.domain.model

/**
 * 平面のみを考慮する
 */
data class GeometricPoint(
    val identifier: Identifier,
    val longitude: Longitude, val latitude: Latitude){
    @JvmInline
    value class Identifier(val longitude: Long,)
    @JvmInline
    value class Longitude(val longitude: Long,)

    @JvmInline
    value class Latitude(val latitude: Long,)
}

