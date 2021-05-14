package kt.koyakei.locationadministrator.event

import kt.koyakei.core.domain.model.areas.location.AdministrativeLocation
import java.io.Serializable

data class LocationCreateEvent(val id: String, val price: Number,val administrativeLocation: AdministrativeLocation): Serializable