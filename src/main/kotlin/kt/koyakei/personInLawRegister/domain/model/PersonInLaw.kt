package kt.koyakei.personInLawRegister.domain.model

import java.awt.Image
import java.time.ZonedDateTime

/**
 * deleted At はここにつけるべきなの？
 * というかそもそも消す必要あるのか？ないだろ。
 * 死亡とかは疾走してからの復活もあるわけで、それぞれのサービスで管理しようぜ
 */
interface PersonInLaw{
    val identifier: Identifier
    val registeredAt: RegisteredAt
    @JvmInline
    value class Identifier(val id : Long)

    @JvmInline
    value class RegisteredAt(val zonedDateTime: ZonedDateTime)
}


