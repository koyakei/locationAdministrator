package kt.koyakei.baseRegistory.geometricMap.domain.aggregate

import kt.koyakei.baseRegistory.geometricMap.domain.event.AreaCreateEvent
import kt.koyakei.baseRegistory.geometricMap.domain.model.GeneralArea
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.spring.stereotype.Aggregate
import java.util.*

@Aggregate
class AreaAggregate(
) {

    lateinit var identifier: Identifier
    lateinit var generalArea: GeneralArea

    class Identifier(val string: String)

    @EventSourcingHandler
    fun on( areaCreateEvent: AreaCreateEvent){
        identifier = Identifier(UUID.randomUUID().toString())
        generalArea = GeneralArea(
            areaCreateEvent.geometricRange,
            GeneralArea.Identifier(UUID.randomUUID().toString())
        )
    }


}