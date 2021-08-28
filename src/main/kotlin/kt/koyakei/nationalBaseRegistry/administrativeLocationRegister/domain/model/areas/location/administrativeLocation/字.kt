package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation


/**
 * 市町村合併は起こる 1720ぐらいなので enum でも良いと思う。
 */
sealed class 字(val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange){
    object 長柄: 字(kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange(listOf()))
}
