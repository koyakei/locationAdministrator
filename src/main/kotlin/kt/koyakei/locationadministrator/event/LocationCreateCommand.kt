package kt.koyakei.locationadministrator.event

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationCreateCommand(@TargetAggregateIdentifier val id: String, val price: Long)