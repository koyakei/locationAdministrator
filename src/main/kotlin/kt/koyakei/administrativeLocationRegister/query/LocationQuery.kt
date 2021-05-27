package kt.koyakei.administrativeLocationRegister.query

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationQuery(@TargetAggregateIdentifier val locationId: String)