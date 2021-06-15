package kt.koyakei.geometricMap.domain.model

class GeneralArea(
    val geometricRange: GeometricRange,
    val identifier: Identifier,
) {

    @JvmInline
    value class Identifier(val long: String)
}