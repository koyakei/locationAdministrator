package kt.koyakei.nationalBaseRegistry.locationRegister.domain.model

import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.地方自治法AddressValueObject
import kt.koyakei.naturalBaseRegistry.Item

interface Facility : Item {
    override val itemName: JapaneseBaseRegisterName
    val status: Status
    val addressValueObject: 地方自治法AddressValueObject
    enum class Status{
        営業中,
        Closed
    }
}