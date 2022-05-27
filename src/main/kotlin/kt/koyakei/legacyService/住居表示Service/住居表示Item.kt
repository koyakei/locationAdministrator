package kt.koyakei.legacyService.住居表示Service

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.naturalBaseRegistry.Item

interface 住居表示Item : Item {
    val allocatedLocationIdentifierList: List<Location.Identifier>

}