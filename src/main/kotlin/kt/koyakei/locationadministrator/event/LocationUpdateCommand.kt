package kt.koyakei.locationadministrator.event

import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject
import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationUpdateCommand(val price: Number,
                                 @TargetAggregateIdentifier val id: String,
val addressValueObjectCity: AddressValueObject.City)