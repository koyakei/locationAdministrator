package kt.koyakei.personIdentifierService.domain.model.personalPhoto

import kt.koyakei.personIdentifierService.domain.model.PersonalIdentificationEvidence
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import java.awt.Image

data class PersonalPhoto<E: PersonalPhoto.Photo>(
    override val personInLawIdentifier: PersonInLaw.Identifier,
    override val evidence: E,
    override val createdAt: PersonalIdentificationEvidence.CreatedAt,
): PersonalIdentificationEvidence<E>{
    @JvmInline
    value class Photo(val image: Image)
}

