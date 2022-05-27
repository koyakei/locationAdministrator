package kt.koyakei.nationalBaseRegistry.locationRegister.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.naturalBaseRegistry.Item

data class AddressAlias(
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt,
    override val identifier: Item.Identifier,
    override val parentItemIdentifier: Item.Identifier,
    override val name: Item.ItemName,
    val locationIdentifierList: List<Location.Identifier>
)
    : Item
