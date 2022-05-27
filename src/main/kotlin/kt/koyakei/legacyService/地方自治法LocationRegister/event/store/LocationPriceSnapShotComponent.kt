package kt.koyakei.legacyService.地方自治法LocationRegister.event.store

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.command.LocationUpdateCommand
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
            "AdministrativeLocationAggregate", evt.id,
            1, evt.administrativeLocationAggregate
        ))
        eventStorageEngine.storeSnapshot(
            GenericDomainEventMessage(
                "AdministrativeLocationAggregate", "AdministrativeLocationAggregate",
                1, evt.administrativeLocationAggregate
            )
        )
    }

    @EventSourcingHandler
    fun on(evt: LocationPriceUpdateSnapShotEvent) {
        eventStorageEngine.storeSnapshot(
            GenericDomainEventMessage("AdministrativeLocationAggregate", "AdministrativeLocationAggregate",
                1, evt.administrativeLocationAggregate)
        )
    }
}