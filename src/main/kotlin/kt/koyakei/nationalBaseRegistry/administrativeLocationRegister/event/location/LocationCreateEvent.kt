package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.event.location

import java.io.Serializable

data class LocationCreateEvent(val id: String, val price: Number,
//                               val administrativeLocationAggregate: AdministrativeLocationAggregate
                               ): Serializable