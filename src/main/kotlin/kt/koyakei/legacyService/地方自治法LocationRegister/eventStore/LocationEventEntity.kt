package kt.koyakei.legacyService.地方自治法LocationRegister.eventStore

import kt.koyakei.legacyService.地方自治法LocationRegister.event.location.LocationCreateEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.modelling.command.AggregateLifecycle
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class LocationEventEntity(@Id val locationId: String,
    val price: Number,
//    @GeneratedValue  val id: Long = 0
){



    @CommandHandler
    constructor(locationCreateEvent: LocationCreateEvent):
            this(locationCreateEvent.id,
locationCreateEvent.price
            ){
        AggregateLifecycle.apply(LocationCreateEvent(
            locationCreateEvent.id,
            locationCreateEvent.price
        ))
    }
}