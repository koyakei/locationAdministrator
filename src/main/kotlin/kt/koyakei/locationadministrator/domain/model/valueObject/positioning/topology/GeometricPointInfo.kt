package kt.koyakei.core.domain.model.valueObject.positioning.topology

/**
 *　緯度経度高度から計測する位置情報
 *　一点のみ
 */
data class GeometricPointInfo(
        val longitude: Double,
        val latitude: Double,
        /**
         * 高度情報は持たない場合が多そう
         */
        val altitude: Double = 0.0
) {


}