package kt.koyakei.personRegister.domain.model

interface PersonInLaw{
    val personInLawIdentifier: PersonInLawIdentifier
}

open class PersonInLawIdentifier(open val id : Long)
