package kt.koyakei.locationadministrator.eventStore

import org.axonframework.eventsourcing.EventSourcedAggregate
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.eventsourcing.EventSourcingRepository
import org.axonframework.messaging.Message
import org.axonframework.messaging.ScopeDescriptor
import org.axonframework.modelling.command.Aggregate
import org.axonframework.modelling.command.GenericJpaRepository
import org.axonframework.modelling.command.Repository
import org.springframework.data.repository.CrudRepository
import java.util.concurrent.Callable

//class LocationEventRepository(builder: Builder<LocationEventEntity>?) : GenericJpaRepository<LocationEventEntity>(
//    builder
//),EventSourcingRepository <LocationEventEntity,EventSourcedAggregate<LocationEventEntity>>
//    CrudRepository<LocationEventEntity, String>