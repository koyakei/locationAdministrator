package kt.koyakei.locationadministrator.aggregate

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
class LocationPrice(
//    @AggregateIdentifier private val id : String,
//                    private val price: Long
                    ){

    @AggregateIdentifier
    private lateinit var id: String
    private lateinit var price: Number

    override fun toString(): String {
        return "id" + id + ":price" + price.toString()
    }

    @CommandHandler
    constructor(locationCreateCommand: LocationCreateCommand): this()  {
        AggregateLifecycle.apply(
            LocationCreateEvent(
                locationCreateCommand.id,
                locationCreateCommand.price
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationCreateEvent) {
        id = evt.id
        price = evt.price
//        AggregateLifecycle.apply(LocationPriceCreateSnapShotEvent(evt.id,this))
    }

    @CommandHandler
    fun handle(locationUpdateCommand: LocationUpdateCommand) {
        AggregateLifecycle.apply(
            LocationUpdateEvent(
                locationUpdateCommand.id,
                locationUpdateCommand.price.toLong()
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationUpdateEvent) {
        price = price.toLong().plus(evt.price)
        AggregateLifecycle.apply(LocationPriceUpdateSnapShotEvent(evt.locationId,this))
    }
}