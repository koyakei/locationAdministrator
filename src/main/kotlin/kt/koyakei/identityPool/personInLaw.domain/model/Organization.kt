package kt.koyakei.personInLawRegister.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item


/**
 * 会社登記とか、スポーツ団体の管理とかは他のサービスでやる
 */
data class Organization(
    override val identifier: PersonInLaw.Identifier,
    val organizationName: OrganizationName,
    override val registeredAt: PersonInLaw.RegisteredAt,
    override val itemIdentifier: Item.Identifier
) : PersonInLaw{
    @JvmInline
    value class OrganizationName(val name: String)
}


