package kt.koyakei.core.domain.model.areas.page

import kt.koyakei.administrativeLocationRegister.domain.model.areas.Area
import java.net.URL

class MobileApplicationPage(
    override val areaIdentifier: Area.AreaIdentifier,
    override val id: Area.AreaIdentifier,
    override val name: Area.AreaName,
) : Page {



    override fun areaURIGenerator(name: String) : URL = URL(name)
}