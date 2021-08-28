package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 * 親子関係を表現するために　親のprefectureを指定したほうがいいか？
 */
sealed class City(val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange, val prefecture: Prefecture){
    object 三浦郡葉山町: City(kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange(listOf()),Prefecture.神奈川県)
}
