package kt.koyakei.personRegister.domain.`interface`.repository

import kt.koyakei.personRegister.domain.model.Person

interface PersonRepository {
    fun findById(identifier: Person.Identifier): Person
}