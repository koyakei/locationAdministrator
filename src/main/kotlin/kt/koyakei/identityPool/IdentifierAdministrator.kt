package kt.koyakei.identityPool

import kt.koyakei.naturalBaseRegistry.Item
/**
 * IPアドレスのようにIdentifierAdministratorごとに Identifierを予め割り当てておく
 */
interface IdentifierAdministrator: Item {
    interface Identifier : Item.Identifier
    val administratingIdentifierRange: AdministratingIdentifierRange

    @JvmInline
    value class AdministratingIdentifierRange( val any: Any)
}