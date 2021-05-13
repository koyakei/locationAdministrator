package kt.koyakei.locationadministrator.event

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationUpdateCommand(val price: Number,
                                 @TargetAggregateIdentifier val id: String)