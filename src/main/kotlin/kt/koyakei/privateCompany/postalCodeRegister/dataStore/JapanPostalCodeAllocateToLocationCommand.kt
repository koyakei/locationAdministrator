package kt.koyakei.privateCompany.postalCodeRegister.dataStore

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

data class JapanPostalCodeAllocateToLocationCommand(
    val locationIdentifier: Location.Identifier,
    val japanPostalCodeIdentifier: JapanPostalCode.Identifier
)
