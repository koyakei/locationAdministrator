package kt.koyakei.locationadministrator.event

import kt.koyakei.locationadministrator.aggregate.LocationPrice
import org.axonframework.commandhandling.CommandBus
import org.axonframework.commandhandling.GenericCommandMessage
import org.axonframework.commandhandling.gateway.CommandGateway
import org.axonframework.eventsourcing.eventstore.EventStorageEngine
import org.axonframework.queryhandling.QueryHandler
import org.springframework.stereotype.Service
import reactor.kotlin.core.publisher.toMono

@Service
class LocationPriceReadComponent(private val eventStoreEngine: EventStorageEngine ,
                                 private val commandBus: CommandBus,
                                private val commandGateway: CommandGateway) {
    @QueryHandler
    fun handle(locationReadQuery: LocationReadQuery): LocationPrice {
        lateinit var locationPrice: LocationPrice
        var list = eventStoreEngine.readSnapshot("LocationPrice").map {
            locationPrice = it.payload as LocationPrice
        }

        var events = eventStoreEngine.readEvents("LocationPrice")
        events.forEach {
            it.payload
         }
        return locationPrice
    }
}