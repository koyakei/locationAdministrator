package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.手続法.刑事訴訟法

import kt.koyakei.personRegister.domain.model.PersonInLaw
import java.time.ZonedDateTime


/**
 * マイクロサービスにする　person とは1:1関係にする。
 */
data class Prosecutor(
    val identifier: Identifier,
    val personIdentifier: PersonInLaw.Identifier,
    val getAuthorityAt: Prosecutor.GetAuthorityAt,
    val expiredAuthorityAt: ExpiredAuthorityAt
) {
    @JvmInline
    value class Identifier(val id: Long)

    @JvmInline
    value class GetAuthorityAt( val time: ZonedDateTime)

    @JvmInline
    value class ExpiredAuthorityAt( val time: ZonedDateTime)

}

