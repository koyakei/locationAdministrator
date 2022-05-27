package kt.koyakei.privateCompany.postalCodeRegister.event

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

data class PostalCodeCreateEvent(
    val postalCode: JapanPostalCode,
    val addressIdentifier: Location.Identifier
)