package kt.koyakei.baseRegistory.geometricMap.domain.service.soil

/**
 * 土壌流出や改良による土壌の変化を記録する
 *
 */
interface SoilTransformationService {
    /**
     * 運ばれるもとの土壌がどこから来たのかを必ず特定する必要はなし。
     * むしろわからないことが多い
     */
    fun 堆積()

    /**
     * 流出先を特定する義務はない
     * 海に向かって流出しているかどうか、特定することはできないだろう。
     * 空に向かって飛んでるかもしれないし。参考情報程度に記録する。
     */
    fun 流出()

}