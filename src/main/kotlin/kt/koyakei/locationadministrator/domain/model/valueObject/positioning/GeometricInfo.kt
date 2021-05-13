package kt.koyakei.core.domain.model.valueObject.positioning

import kt.koyakei.core.domain.model.valueObject.positioning.topology.GeometricPointInfo

/**
 * 住所と緯度経度は両方持つ？　矛盾している場合があるのでは？
 *　住所　緯度経度の変換ライブラリとして、公開しようかなぁ
 *
 */
data class GeometricInfo(
        val geometricPointInfo: GeometricPointInfo,
        val addressValueObjectInfo: AddressValueObject
)