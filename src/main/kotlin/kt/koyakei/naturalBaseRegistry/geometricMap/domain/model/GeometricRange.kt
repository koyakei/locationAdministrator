package kt.koyakei.naturalBaseRegistry.geometricMap.domain.model

/**
 * 範囲指定
 * 指定地点の内側
 * ギザギザになるけど、そこはどうするんだ？
 * フーリエ変換とかまさか使い分けじゃないよね。
 */
data class GeometricRange(val geometricPointList: List<kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint>,
                          val identifier: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange.Identifier
){
    @JvmInline
    value class Identifier(val long: Long)
}

