package kt.koyakei.personInLawRegister.domain.model

import kt.koyakei.naturalBaseRegistry.Item

/**
 * deleted At はここにつけるべきなの？
 * というかそもそも消す必要あるのか？ないだろ。
 * 死亡とかは疾走してからの復活もあるわけで、それぞれのサービスで管理しようぜ
 * マイクロサービスにする前提で法人IDを
 */
interface PersonInLaw: Item{
    override val identifier: Identifier
    data class Identifier(override val long: Long) : Item.Identifier
}


