package kt.koyakei.administrativeLocationRegister.event

import kt.koyakei.locationadministrator.event.LocationUpdateEvent
import org.springframework.stereotype.Service
import javax.persistence.EntityManager

@Service
class LocationPriceCommandComponent(private val entityManager: EntityManager){
    fun on(evt: LocationUpdateEvent) {

    }
}