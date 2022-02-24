package kt.koyakei.identityPool.itemIdentifierRegister.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

interface Item {
    val identifier: Identifier
    interface Identifier {
        val long: Long
    }

    val createdAt: CreatedAt

    val vailedAt: VailedAt

}