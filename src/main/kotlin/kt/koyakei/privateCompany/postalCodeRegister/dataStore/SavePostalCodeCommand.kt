package kt.koyakei.privateCompany.postalCodeRegister.dataStore

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

data class SavePostalCodeCommand(
    val createdAt: CreatedAt,
    val vailedAt: VailedAt,
    val parentItemIdentifier: Item.Identifier,
    val name: Item.ItemName
)
