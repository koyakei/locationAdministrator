package kt.koyakei.personIdentifierService.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import java.awt.Image

data class 住基カード<E: 住基カード.パスワード>(
    override val personInLawIdentifier: PersonInLaw.Identifier,
    override val evidence: E,
    override val createdAt: PersonalIdentificationEvidence.CreatedAt,
): PersonalIdentificationEvidence<E>{


    @JvmInline
    value class パスワード(val string: String)
}