package kt.koyakei.core.domain.model.areas.page

import kt.koyakei.naturalBaseRegistry.area.Area
import java.net.URL

class MobileApplicationPage(
    val identifier: Area.Identifier,
    override val identifier: Area.Identifier,
    override val name: Area.AreaName,
) : Page {



    override fun areaURIGenerator(name: String) : URL = URL(name)
}