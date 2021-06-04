package kt.koyakei.geometricMap.domain.model

import kt.koyakei.geometricMap.domain.model.GeometricPoint

/**
 * 範囲指定
 * 指定地点の内側
 * ギザギザになるけど、そこはどうするんだ？
 * フーリエ変換とかまさか使い分けじゃないよね。
 */
data class GeometricRange(val geometricPointList: List<GeometricPoint>,
val identifier: Identifier){
    @JvmInline
    value class Identifier(val long: Long)
}

