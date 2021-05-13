package kt.koyakei.locationadministrator.event.store

import kt.koyakei.locationadministrator.event.LocationUpdateCommand
import org.axonframework.eventhandling.*
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.eventsourcing.eventstore.EventStorageEngine
import org.springframework.stereotype.Component

@Component
class LocationPriceSnapShotComponent(
    private val eventStorageEngine: EventStorageEngine
) {
    @EventHandler
    fun on(locationUpdateCommand: LocationUpdateCommand) {
    }

    @EventSourcingHandler
    fun on(evt: LocationPriceCreateSnapShotEvent) {
        eventStorageEngine.appendEvents(GenericDomainEventMessage(
            "LocationPrice", evt.id,
            1, evt.locationPrice
        ))
        eventStorageEngine.storeSnapshot(
            GenericDomainEventMessage(
                "LocationPrice", "LocationPrice",
                1, evt.locationPrice
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationPriceUpdateSnapShotEvent) {
        eventStorageEngine.storeSnapshot(
            GenericDomainEventMessage("LocationPrice", "LocationPrice",
                1, evt.locationPrice)
        )
    }
}