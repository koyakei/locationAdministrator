package kt.koyakei.naturalBaseRegistry.geometricMap.domain.aggregate

import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.spring.stereotype.Aggregate
import java.util.*

@Aggregate
class AreaAggregate(
) {

    lateinit var identifier: kt.koyakei.naturalBaseRegistry.geometricMap.domain.aggregate.AreaAggregate.Identifier
    lateinit var generalArea: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeneralArea

    class Identifier(val string: String)

    @EventSourcingHandler
    fun on( areaCreateEvent: kt.koyakei.naturalBaseRegistry.geometricMap.domain.event.AreaCreateEvent){
        identifier =
            kt.koyakei.naturalBaseRegistry.geometricMap.domain.aggregate.AreaAggregate.Identifier(UUID.randomUUID().toString())
        generalArea = kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeneralArea(
            areaCreateEvent.geometricRange,
            kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeneralArea.Identifier(UUID.randomUUID().toString())
        )
    }


}