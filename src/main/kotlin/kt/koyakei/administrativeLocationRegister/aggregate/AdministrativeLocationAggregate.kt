package kt.koyakei.administrativeLocationRegister.aggregate


import kt.koyakei.administrativeLocationRegister.command.LocationCreateCommand
import kt.koyakei.administrativeLocationRegister.command.LocationUpdateCommand
import kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation.AdministrativeLocation
import kt.koyakei.administrativeLocationRegister.event.location.LocationCreateEvent
import kt.koyakei.administrativeLocationRegister.event.location.LocationUpdateEvent
import kt.koyakei.administrativeLocationRegister.event.store.LocationPriceUpdateSnapShotEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventhandling.AllowReplay
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
@AllowReplay
class AdministrativeLocationAggregate () {

    @AggregateIdentifier
    private lateinit var id: String
    private lateinit var price: Number
    private lateinit var administrativeLocation: AdministrativeLocation

    override fun toString(): String {
        return "id$id:price$price:" +
                "AdministrativeLocationAggregate$administrativeLocation"
    }

    @CommandHandler
    constructor(locationCreateCommand: LocationCreateCommand) : this() {
        AggregateLifecycle.apply(
            LocationCreateEvent(
                locationCreateCommand.id,
                locationCreateCommand.price,
//                AdministrativeLocationAggregate(
//                    locationCreateCommand.areaId,
//                    locationCreateCommand.administrativeLocationName,
//                    locationCreateCommand.enterLocationCondition,
//                    locationCreateCommand.areaIdentifier,
//                    locationCreateCommand.addressValueObject
//                )
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationCreateEvent) {
        id = evt.id
        price = evt.price
//        administrativeLocationAggregate = evt.administrativeLocationAggregate
    }

    @CommandHandler
    fun handle(locationUpdateCommand: LocationUpdateCommand) {
        AggregateLifecycle.apply(
            LocationUpdateEvent(
                locationUpdateCommand.id,
                locationUpdateCommand.price.toLong(),
//                locationUpdateCommand.addressValueObjectCity
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationUpdateEvent) {
        price = price.toLong().plus(evt.price)
//        administrativeLocationAggregate = administrativeLocationAggregate
//            .copy(
//                addressValueObject = administrativeLocationAggregate.addressValueObject
//                    .copy(city = evt.locationValueObjectCity)
//            )
        AggregateLifecycle.apply(LocationPriceUpdateSnapShotEvent(evt.locationId, this))
    }
}