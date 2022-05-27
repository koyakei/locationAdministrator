package kt.koyakei.privateCompany.postalCodeRegister.event

import kt.koyakei.identityPool.VailedAt
import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.naturalBaseRegistry.Item

data class PostalCodeCreateEvent(
    val vailedAt: VailedAt,
    val parentItemIdentifier: Item.Identifier,
    val name: Item.ItemName,
    val locationIdentifier: Location.Identifier
)