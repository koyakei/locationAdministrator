package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 */
sealed class StreetNumber(val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange){
    object A111111: StreetNumber(kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange(listOf()))
    object 番外地: StreetNumber(kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange(listOf()))
}
