package kt.koyakei.locationadministrator.event

import kt.koyakei.core.domain.model.areas.Area
import kt.koyakei.core.domain.model.areas.location.Location
import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject
import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationCreateCommand(@TargetAggregateIdentifier val id: String,
                                 val areaId: Area.AreaIdentifier,
                                 val administrativeLocationName: Area.AreaName,
                                 val enterLocationCondition: Location.EnterLocationCondition,
                                 val areaIdentifier: Area.AreaIdentifier,
                                 val addressValueObject: AddressValueObject,
                                 val price: Long)