package kt.koyakei.locationadministrator.event

import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject

data class LocationUpdateEvent(val locationId: String,
                               val price: Long,
                               val locationValueObjectCity: AddressValueObject.City
)