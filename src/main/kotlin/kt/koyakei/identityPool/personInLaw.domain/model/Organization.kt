package kt.koyakei.personInLawRegister.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw
import kt.koyakei.naturalBaseRegistry.Item


/**
 * 会社登記とか、スポーツ団体の管理とかは他のサービスでやる
 */
data class Organization(
    override val identifier: PersonInLaw.Identifier,
    val organizationName: OrganizationName,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt,
    override val parentItemIdentifier: Item.Identifier,
    override val name: Item.ItemName
) : PersonInLaw {
    @JvmInline
    value class OrganizationName(val name: String)
}


