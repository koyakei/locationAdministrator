package kt.koyakei.identityPool

import kt.koyakei.naturalBaseRegistry.Item

/**
 * Identifierを割り当てる
 */
interface IdentifierAllocator {
    val identifierAdministratorRepository: IdentifierAdministratorRepository


    fun handle(identifierAdministrator: IdentifierAdministrator): Item.Identifier
}