package kt.koyakei.geometricMap.domain.model

/**
 * 平面のみを考慮する
 */
data class GeometricPoint(val longitude: Longitude, val latitude: Latitude){
    @JvmInline
    value class Longitude(val longitude: Long,)

    @JvmInline
    value class Latitude(val latitude: Long,)
}

