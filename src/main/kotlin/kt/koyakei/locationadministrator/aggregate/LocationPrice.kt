package kt.koyakei.locationadministrator.aggregate

import kt.koyakei.core.domain.model.areas.Area
import kt.koyakei.core.domain.model.areas.location.AdministrativeLocation
import kt.koyakei.core.domain.model.areas.location.BusinessLocation
import kt.koyakei.locationadministrator.event.LocationCreateCommand
import kt.koyakei.locationadministrator.event.LocationCreateEvent
import kt.koyakei.locationadministrator.event.LocationUpdateCommand
import kt.koyakei.locationadministrator.event.LocationUpdateEvent
import kt.koyakei.locationadministrator.event.store.LocationPriceCreateSnapShotEvent
import kt.koyakei.locationadministrator.event.store.LocationPriceUpdateSnapShotEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventhandling.AllowReplay
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
@AllowReplay
class LocationPrice() {

    @AggregateIdentifier
    private lateinit var id: String
    private lateinit var price: Number
    private lateinit var administrativeLocation: AdministrativeLocation

    override fun toString(): String {
        return "id$id:price$price:AdministrativeLocation$administrativeLocation"
    }

    @CommandHandler
    constructor(locationCreateCommand: LocationCreateCommand) : this() {
        AggregateLifecycle.apply(
            LocationCreateEvent(
                locationCreateCommand.id,
                locationCreateCommand.price,
                AdministrativeLocation(
                    locationCreateCommand.areaId,
                    locationCreateCommand.administrativeLocationName,
                    locationCreateCommand.enterLocationCondition,
                    locationCreateCommand.areaIdentifier,
                    locationCreateCommand.addressValueObject
                )
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationCreateEvent) {
        id = evt.id
        price = evt.price
        administrativeLocation = evt.administrativeLocation
    }

    @CommandHandler
    fun handle(locationUpdateCommand: LocationUpdateCommand) {
        AggregateLifecycle.apply(
            LocationUpdateEvent(
                locationUpdateCommand.id,
                locationUpdateCommand.price.toLong(),
                locationUpdateCommand.addressValueObjectCity
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationUpdateEvent) {
        price = price.toLong().plus(evt.price)
        administrativeLocation = administrativeLocation
            .copy(
                addressValueObject = administrativeLocation.addressValueObject
                    .copy(city = evt.locationValueObjectCity)
            )
        AggregateLifecycle.apply(LocationPriceUpdateSnapShotEvent(evt.locationId, this))
    }


}