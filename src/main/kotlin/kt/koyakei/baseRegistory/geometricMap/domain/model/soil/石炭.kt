package kt.koyakei.baseRegistory.geometricMap.domain.model.soil

interface 石炭 {
    val soilRange: SoilRange
    val 石炭化の程度v: 石炭化の程度

    enum class 石炭化の程度{
        無煙炭,
        瀝青炭,
        褐炭,
        泥炭
    }
}