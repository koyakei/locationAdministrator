package kt.koyakei.administrativeLocationRegister.event

import kt.koyakei.locationadministrator.aggregate.AdministrativeLocationAggregate
import org.axonframework.commandhandling.CommandBus
import org.axonframework.commandhandling.gateway.CommandGateway
import org.axonframework.eventsourcing.eventstore.EventStorageEngine
import org.axonframework.queryhandling.QueryHandler
import org.springframework.stereotype.Service

@Service
class LocationPriceReadComponent(private val eventStoreEngine: EventStorageEngine ,
                                 private val commandBus: CommandBus,
                                private val commandGateway: CommandGateway) {
    @QueryHandler
    fun handle(locationReadQuery: LocationReadQuery): AdministrativeLocationAggregate {
        lateinit var administrativeLocationAggregate: AdministrativeLocationAggregate
        var list = eventStoreEngine.readSnapshot("AdministrativeLocationAggregate").map {
            administrativeLocationAggregate = it.payload as AdministrativeLocationAggregate
        }

        var events = eventStoreEngine.readEvents("AdministrativeLocationAggregate")
        events.forEach {
            it.payload
         }
        return administrativeLocationAggregate
    }
}