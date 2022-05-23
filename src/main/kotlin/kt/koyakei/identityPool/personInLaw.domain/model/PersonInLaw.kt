package kt.koyakei.personInLawRegister.domain.model

import kt.koyakei.naturalBaseRegistry.Item
import java.time.ZonedDateTime

/**
 * deleted At はここにつけるべきなの？
 * というかそもそも消す必要あるのか？ないだろ。
 * 死亡とかは疾走してからの復活もあるわけで、それぞれのサービスで管理しようぜ
 * マイクロサービスにする前提で法人IDを
 */
interface PersonInLaw{
    val identifier: Item.Identifier
    val itemIdentifier: Item.Identifier
    val registeredAt: RegisteredAt

    @JvmInline
    value class RegisteredAt(val zonedDateTime: ZonedDateTime)
}


