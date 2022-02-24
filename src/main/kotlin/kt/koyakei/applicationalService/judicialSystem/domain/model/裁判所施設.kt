package kt.koyakei.applicationalService.judicialSystem.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item

class 裁判所施設(
    override val identifier: Item.Identifier,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt
): Item