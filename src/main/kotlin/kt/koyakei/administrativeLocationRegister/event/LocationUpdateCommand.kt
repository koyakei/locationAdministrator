package kt.koyakei.administrativeLocationRegister.event

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationUpdateCommand(val price: Number,
                                 @TargetAggregateIdentifier val id: String,
//val addressValueObjectCity: AddressValueObject.City
)