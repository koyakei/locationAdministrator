package kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

import kt.koyakei.geometricMap.domain.model.GeometricRange


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 * 親子関係を表現するために　親のprefectureを指定したほうがいいか？
 */
sealed class City(val geometricRange: GeometricRange, val prefecture: Prefecture){
    object 三浦郡葉山町: City(GeometricRange(listOf()),Prefecture.神奈川県)
}
