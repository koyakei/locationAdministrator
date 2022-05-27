package kt.koyakei.privateCompany.postalCodeRegister.dataStore

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

data class JapanPostalCodeAllocateToLocationCommand(
    val locationIdentifier: Location.Identifier,
    val japanPostalCodeIdentifier: JapanPostalCode.Identifier
)
