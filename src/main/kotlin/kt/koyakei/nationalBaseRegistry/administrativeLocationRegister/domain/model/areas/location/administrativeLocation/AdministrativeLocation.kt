package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.Area
import kt.koyakei.core.domain.model.areas.location.Location
import java.net.URL

/**
 * 行政区域
 */
data class AdministrativeLocation(
    override val id: Area.AreaIdentifier,
    override val name: Area.AreaName,
    override val enterLocationCondition: Location.EnterLocationCondition,
    override val areaIdentifier: Area.AreaIdentifier,
    val addressValueObject: AddressValueObject
) : Location, Area<Area.AreaIdentifier> {

    override fun areaURIGenerator(name: String): URL {
        TODO("Not yet implemented")
    }
}