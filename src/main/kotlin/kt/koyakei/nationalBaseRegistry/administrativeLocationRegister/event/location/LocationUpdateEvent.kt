package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.event.location

data class LocationUpdateEvent(val locationId: String,
                               val price: Long,
//                               val locationValueObjectCity: AddressValueObject.City
)