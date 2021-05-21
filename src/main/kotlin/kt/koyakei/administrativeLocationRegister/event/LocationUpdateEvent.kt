package kt.koyakei.administrativeLocationRegister.event

data class LocationUpdateEvent(val locationId: String,
                               val price: Long,
//                               val locationValueObjectCity: AddressValueObject.City
)