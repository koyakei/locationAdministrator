package kt.koyakei.personRegister.domain.model

data class Organization(
    override val personInLawIdentifier: PersonInLawIdentifier,
    val organizationName: OrganizationName,
) : PersonInLaw

@JvmInline
value class OrganizationName(val name: String)
