package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.query

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationQuery(@TargetAggregateIdentifier val locationId: String)