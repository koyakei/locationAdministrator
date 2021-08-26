package kt.koyakei.applicationalService.personIdentifierService.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import java.time.ZonedDateTime

/**
 * 個人的証拠
 */
interface PersonalIdentificationEvidence<out E : Any> {
    @JvmInline
    value class CreatedAt(val zonedDateTime: ZonedDateTime)
    val createdAt: CreatedAt
    val personInLawIdentifier: PersonInLaw.Identifier
    val evidence: E

}