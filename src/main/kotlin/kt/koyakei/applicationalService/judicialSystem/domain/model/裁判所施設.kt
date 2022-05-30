package kt.koyakei.applicationalService.judicialSystem.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.naturalBaseRegistry.Item

class 裁判所施設(
    override val identifier: Item.Identifier,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt,
    override val parentItemIdentifier: Item.Identifier,
    override val name: Item.ItemName
): Item