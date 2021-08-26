package kt.koyakei.personInLawRegister.domain.model


/**
 * 会社登記とか、スポーツ団体の管理とかは他のサービスでやる
 */
data class Organization(
    override val identifier: PersonInLaw.Identifier,
    val organizationName: OrganizationName,
    override val registeredAt: PersonInLaw.RegisteredAt
) : PersonInLaw{
    @JvmInline
    value class OrganizationName(val name: String)
}


