package kt.koyakei.legacyService.地方自治法LocationRegister.query

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationQuery(@TargetAggregateIdentifier val locationId: String)