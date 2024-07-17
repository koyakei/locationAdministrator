package kt.koyakei.personInLawRegister.domain.`interface`.repository

import kt.koyakei.identityPool.personInLaw.domain.model.Person
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

interface PersonRepository {
    fun findById(identifier: PersonInLaw.Identifier): Person
}