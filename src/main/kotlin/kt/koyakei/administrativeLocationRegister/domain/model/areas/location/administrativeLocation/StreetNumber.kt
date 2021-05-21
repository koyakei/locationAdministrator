package kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

import kt.koyakei.geometricMap.domain.model.GeometricRange


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 */
sealed class StreetNumber(val geometricRange: GeometricRange){
    object A111111: StreetNumber(GeometricRange(listOf()))
    object 番外地: StreetNumber(GeometricRange(listOf()))
}
