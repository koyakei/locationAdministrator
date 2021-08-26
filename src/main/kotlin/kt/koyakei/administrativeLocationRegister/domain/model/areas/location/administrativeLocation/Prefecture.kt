package kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

import kt.koyakei.baseRegistory.geometricMap.domain.model.GeometricRange


/**
 * 廃藩置県や道州制の導入はないものとして考える。
 * 40年ぐらい使えるシステム
 * 住所から　アドレスを取得
 * これ郵便番号のclassに置かなくてもいいのかな？　返り値の型に置いとけばいいか？　でもそしたら self が使えんぞ
 */
sealed class Prefecture(val geometricRange: GeometricRange){
    object 神奈川県: Prefecture(GeometricRange(listOf(),GeometricRange.Identifier(1)))
}
