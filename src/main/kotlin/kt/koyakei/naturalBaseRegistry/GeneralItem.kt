package kt.koyakei.naturalBaseRegistry

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

data class GeneralItem(
    override val identifier: Item.Identifier,
    override val parentItemIdentifier: Item.Identifier = RootItem.identifier,
    override val name: Item.ItemName,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt
): Item
