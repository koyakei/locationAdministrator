package kt.koyakei.privateCompany.postalCodeRegister.aggregate

import kt.koyakei.privateCompany.postalCodeRegister.dataStore.JapanPostalCodeRepository
import kt.koyakei.privateCompany.postalCodeRegister.dataStore.SavePostalCodeCommand
import kt.koyakei.privateCompany.postalCodeRegister.event.PostalCodeCreateEvent
import org.axonframework.eventhandling.AllowReplay
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.spring.stereotype.Aggregate

/**
 * 郵便番号を割り当てる対象のLocation ID は住所検索システムなどから特定しておく
 */
@Aggregate
@AllowReplay
class JapanPostalCodeAggregate(
    val japanPostalCodeRepository: JapanPostalCodeRepository
) {
    @AggregateIdentifier
    private lateinit var id: String

    @EventSourcingHandler
    fun on(evt: PostalCodeCreateEvent) {
        val v = japanPostalCodeRepository.save(
            SavePostalCodeCommand(
                evt.vailedAt,
                evt.parentItemIdentifier,
                evt.name,
                evt.locationIdentifier
            )
        )
        id = v.identifier.toString()
    }

}