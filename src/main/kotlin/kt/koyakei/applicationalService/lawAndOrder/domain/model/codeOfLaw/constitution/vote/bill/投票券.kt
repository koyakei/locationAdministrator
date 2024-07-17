package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw
import java.time.ZonedDateTime

data class 投票券(
    val voter: PersonInLaw.Identifier,
    val votedAt: VotedAt,
    val votedTp: 投票先,
    val identifier: Identifier,
) {
    @JvmInline
    value class Identifier(val id: Long)

    @JvmInline
    value class 投票済(val boolean: Boolean)

    fun isVoted():投票済 = 投票済(votedAt != null)

    @JvmInline
    value class 投票先(val targetIdentifier: Long)

    @JvmInline
    value class VotedAt(val zonedDateTime: ZonedDateTime)
}


