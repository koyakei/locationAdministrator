package kt.koyakei.administrativeLocationRegister.configration

import org.axonframework.config.DefaultConfigurer
import org.axonframework.eventhandling.EventBus
import org.axonframework.eventhandling.SimpleEventBus
import org.axonframework.eventsourcing.*
import org.axonframework.eventsourcing.eventstore.EmbeddedEventStore
import org.axonframework.eventsourcing.eventstore.EventStorageEngine
import org.axonframework.eventsourcing.eventstore.EventStore
import org.axonframework.eventsourcing.eventstore.inmemory.InMemoryEventStorageEngine
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration : DefaultConfigurer() {

    @Bean
    fun eventStorageEngine(): EventStorageEngine {
        return InMemoryEventStorageEngine()
    }

    @Bean
    fun snapshotTrigger(snapshotter: Snapshotter): SnapshotTriggerDefinition {
        return EventCountSnapshotTriggerDefinition(snapshotter, 1)
    }

    @Bean
    fun eventStore(): EventStore {
        return EmbeddedEventStore
            .builder()
            .storageEngine(InMemoryEventStorageEngine())
            .build()
    }

    @Bean
    fun eventBus(): EventBus = SimpleEventBus.builder().build()

    @Bean
    fun eventStore(
        eventStorageEngine: EventStorageEngine
    ): EmbeddedEventStore {
        return EmbeddedEventStore.builder()
            .storageEngine(eventStorageEngine)
            .build()
    }
}

