package kt.koyakei.personRegister.domain.model

data class Organization(
    override val personInLawIdentifier: PersonInLawIdentifier): PersonInLaw
