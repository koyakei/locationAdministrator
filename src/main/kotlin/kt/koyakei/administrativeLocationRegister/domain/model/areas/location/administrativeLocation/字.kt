package kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

import kt.koyakei.baseRegistory.geometricMap.domain.model.GeometricRange


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 */
sealed class 字(val geometricRange: GeometricRange){
    object 長柄: 字(GeometricRange(listOf()))
}
