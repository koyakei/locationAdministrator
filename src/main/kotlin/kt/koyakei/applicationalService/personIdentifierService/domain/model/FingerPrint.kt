package kt.koyakei.applicationalService.personIdentifierService.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import java.awt.Image

data class FingerPrint<E: FingerPrint.FingerPrintPhoto>(
    override val personInLawIdentifier: PersonInLaw.Identifier,
    override val evidence: E,
    override val createdAt: PersonalIdentificationEvidence.CreatedAt,
): PersonalIdentificationEvidence<E> {
    @JvmInline
    value class FingerPrintPhoto(val image: Image)
}