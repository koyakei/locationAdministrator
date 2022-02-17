package kt.koyakei.personInLawRegister.domain.`interface`.repository

import kt.koyakei.personInLawRegister.domain.model.Person
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface PersonRepository {
    fun findById(identifier: PersonInLaw.Identifier): Person
}