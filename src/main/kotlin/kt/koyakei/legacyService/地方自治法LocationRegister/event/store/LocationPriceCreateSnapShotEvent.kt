package kt.koyakei.legacyService.地方自治法LocationRegister.event.store

import kt.koyakei.legacyService.地方自治法LocationRegister.aggregate.AdministrativeLocationAggregate


data class LocationPriceCreateSnapShotEvent(val id: String, val administrativeLocationAggregate: AdministrativeLocationAggregate)