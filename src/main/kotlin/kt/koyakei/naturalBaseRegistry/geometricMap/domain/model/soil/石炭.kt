package kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.soil

interface 石炭 {
    val soilRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.soil.SoilRange
    val 石炭化の程度v: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.soil.石炭.石炭化の程度

    enum class 石炭化の程度{
        無煙炭,
        瀝青炭,
        褐炭,
        泥炭
    }
}