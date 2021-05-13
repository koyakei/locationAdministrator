package kt.koyakei.core.domain.model.areas.location

import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject
import java.net.URL

/**
 * 行政区域
 */
class AdministrativeLocation(
    override val id: Long,
    override val name: String,
    override val enterLocationCondition: Location.EnterLocationCondition,
    override val areaIdentifier: Location.LocationIdentifier,
    val addressValueObject: AddressValueObject
) : Location<Location.LocationIdentifier>{
    override fun areaURIGenerator(name: String): URL {
        TODO("Not yet implemented")
    }
}