package kt.koyakei.legacyService.地方自治法LocationRegister.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class LocationCreateCommand(@TargetAggregateIdentifier val id: String,
//                                 val areaId: Long,
//                                 val administrativeLocationName: Area.AreaName,
//                                 val enterLocationCondition: Location.EnterLocationCondition,
//                                 val identifier: Area.Identifier,
//                                 val addressValueObject: AddressValueObject,
                                 val price: Long)