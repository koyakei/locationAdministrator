package kt.koyakei.identityPool.itemIdentifierRegister.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

interface Item {
    val identifier: Identifier
    @JvmInline
    value class Identifier(val Long: Long)

    val createdAt: CreatedAt

    val vailedAt: VailedAt

}