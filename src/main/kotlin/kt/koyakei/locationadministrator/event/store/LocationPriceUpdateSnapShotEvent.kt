package kt.koyakei.locationadministrator.event.store

import kt.koyakei.locationadministrator.aggregate.LocationPrice

data class LocationPriceUpdateSnapShotEvent(val id : String, val locationPrice: LocationPrice)