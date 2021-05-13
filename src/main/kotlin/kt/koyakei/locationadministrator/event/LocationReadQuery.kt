package kt.koyakei.locationadministrator.event

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationReadQuery(@TargetAggregateIdentifier val locationId: String)