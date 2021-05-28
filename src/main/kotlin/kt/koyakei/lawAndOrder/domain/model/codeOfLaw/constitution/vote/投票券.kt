package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.personRegister.domain.model.PersonInLaw
import java.time.ZonedDateTime

interface 投票券 {
    val personInLawIdentifier: PersonInLaw.Identifier
    val votedAt: VotedAt
}

@JvmInline
value class VotedAt(val zonedDateTime: ZonedDateTime)
