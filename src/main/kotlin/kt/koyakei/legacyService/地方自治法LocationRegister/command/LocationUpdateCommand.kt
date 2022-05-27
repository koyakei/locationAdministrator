package kt.koyakei.legacyService.地方自治法LocationRegister.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationUpdateCommand(val price: Number,
                                 @TargetAggregateIdentifier val id: String,
//val addressValueObjectCity: AddressValueObject.City
)