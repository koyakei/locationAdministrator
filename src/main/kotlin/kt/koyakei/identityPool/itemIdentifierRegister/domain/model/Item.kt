package kt.koyakei.identityPool.itemIdentifierRegister.domain.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

/**
 * 全ての対象に付与される識別子は一意である。
 */
interface Item<out Identifier> {
    val identifier: Identifier
    interface Identifier {
        val long: Long
    }

    val createdAt: CreatedAt

    val vailedAt: VailedAt

}