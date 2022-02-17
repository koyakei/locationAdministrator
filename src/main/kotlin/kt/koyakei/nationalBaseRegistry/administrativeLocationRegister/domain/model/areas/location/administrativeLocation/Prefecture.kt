package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation


/**
 * 廃藩置県や道州制の導入はないものとして考える。
 * 40年ぐらい使えるシステム
 * 住所から　アドレスを取得
 * これ郵便番号のclassに置かなくてもいいのかな？　返り値の型に置いとけばいいか？　でもそしたら self が使えんぞ
 */
sealed class Prefecture(val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange){
    object 神奈川県: Prefecture(
        kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange(
            listOf()
        )
    )
}
