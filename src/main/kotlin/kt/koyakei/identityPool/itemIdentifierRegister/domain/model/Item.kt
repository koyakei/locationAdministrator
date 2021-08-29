package kt.koyakei.identityPool.itemIdentifierRegister.domain.model

import java.time.LocalDateTime

interface Item {
    val identifier: Identifier
    @JvmInline
    value class Identifier(val Long: Long)

    val createdAt: CreatedAt

    @JvmInline
    value class CreatedAt(val localDateTime: LocalDateTime)
}