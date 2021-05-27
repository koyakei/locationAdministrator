package kt.koyakei.personRegister.domain.model

data class Organization(
    override val identifier: PersonInLaw.Identifier,
    val organizationName: OrganizationName,
) : PersonInLaw{
    @JvmInline
    value class OrganizationName(val name: String)
}


