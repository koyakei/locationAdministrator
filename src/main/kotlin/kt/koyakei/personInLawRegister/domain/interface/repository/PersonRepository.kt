package kt.koyakei.personInLawRegister.domain.`interface`.repository

import kt.koyakei.personInLawRegister.domain.model.Person

interface PersonRepository {
    fun findById(identifier: Person.Identifier): Person
}