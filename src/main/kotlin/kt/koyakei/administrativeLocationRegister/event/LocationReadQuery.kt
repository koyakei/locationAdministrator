package kt.koyakei.administrativeLocationRegister.event

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationReadQuery(@TargetAggregateIdentifier val locationId: String)