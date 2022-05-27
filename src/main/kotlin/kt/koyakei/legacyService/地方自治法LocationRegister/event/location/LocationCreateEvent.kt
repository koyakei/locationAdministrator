package kt.koyakei.legacyService.地方自治法LocationRegister.event.location

import java.io.Serializable

data class LocationCreateEvent(val id: String, val price: Number,
//                               val administrativeLocationAggregate: AdministrativeLocationAggregate
                               ): Serializable