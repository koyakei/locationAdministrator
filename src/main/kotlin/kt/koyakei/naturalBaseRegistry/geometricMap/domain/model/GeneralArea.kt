package kt.koyakei.naturalBaseRegistry.geometricMap.domain.model

class GeneralArea(
    val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange,
    val identifier: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeneralArea.Identifier,
) {

    @JvmInline
    value class Identifier(val long: String)
}