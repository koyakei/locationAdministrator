package kt.koyakei.legacyService.住居表示Service

import kt.koyakei.legacyService.住居表示Service.frontage.Frontage

/**
 * frontage と玄関エンティティーから住居表示を生成する
 * 本当は frontage の起点と終点を与えるだけで、frontage List を生成して玄関の位置から住居表示を生成してほしい
 */
interface フロンテージから住居表示生成Service {
    val frontageList: List<Frontage>
    val 玄関List: List<Any>
    fun handle(): List<住居表示Item>
}