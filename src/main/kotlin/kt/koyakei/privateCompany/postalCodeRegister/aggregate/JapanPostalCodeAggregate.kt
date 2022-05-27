package kt.koyakei.privateCompany.postalCodeRegister.aggregate

import kt.koyakei.legacyService.地方自治法LocationRegister.event.location.LocationUpdateEvent
import kt.koyakei.privateCompany.postalCodeRegister.dataStore.AllocateJapanPostalCodeToLocationRepository
import kt.koyakei.privateCompany.postalCodeRegister.dataStore.JapanPostalCodeAllocateToLocationCommand
import kt.koyakei.privateCompany.postalCodeRegister.dataStore.JapanPostalCodeRepository
import kt.koyakei.privateCompany.postalCodeRegister.dataStore.SavePostalCodeCommand
import kt.koyakei.privateCompany.postalCodeRegister.event.AllocateJapanPostalCodeToLocationEvent
import kt.koyakei.privateCompany.postalCodeRegister.event.PostalCodeCreateEvent
import org.axonframework.eventhandling.AllowReplay
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
@AllowReplay
class JapanPostalCodeAggregate(
    val japanPostalCodeRepository: JapanPostalCodeRepository
) {
    @AggregateIdentifier
    private lateinit var id: String
    private lateinit var allocateJapanPostalCodeToLocationRepository: AllocateJapanPostalCodeToLocationRepository

    @EventSourcingHandler
    fun on(evt: PostalCodeCreateEvent) {
        val v = japanPostalCodeRepository.save(
            SavePostalCodeCommand(
                evt.postalCode.createdAt,
                evt.postalCode.vailedAt,
                evt.postalCode.parentItemIdentifier,
                evt.postalCode.name
            )
        )
        id = v.identifier.toString()
    }

    @EventSourcingHandler
    fun on(evt: AllocateJapanPostalCodeToLocationEvent){
        allocateJapanPostalCodeToLocationRepository.save(
            JapanPostalCodeAllocateToLocationCommand(
                evt.locationIdentifier,
                evt.postalCodeIdentifier
            )
        )
    }


}