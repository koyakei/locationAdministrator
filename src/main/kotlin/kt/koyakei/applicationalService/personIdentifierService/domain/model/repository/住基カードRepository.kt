package kt.koyakei.applicationalService.personIdentifierService.domain.model.repository

import kt.koyakei.applicationalService.personIdentifierService.domain.model.住基カード
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface 住基カードRepository {
    fun findByUserIdentifier(personInLawIdentifier: PersonInLaw.Identifier): 住基カード.パスワード
}