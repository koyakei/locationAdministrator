package kt.koyakei.legacyService.地番表示Service

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.naturalBaseRegistry.Item

interface 地番表示Item : Item {
    val allocatedLocationIdentifierList: List<Location.Identifier>

}