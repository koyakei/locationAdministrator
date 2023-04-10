package kt.koyakei.core.domain.model.areas.page

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.naturalBaseRegistry.area.Area
import java.net.URL

class MobileApplicationPage(
    override val identifier: Area.Identifier,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt,
    override val parentItemIdentifier: Item.Identifier, override val name: Item.ItemName,
    override val itemName: Item.ItemName,
) : Page {



    override fun areaURIGenerator(name: String) : URL = URL(name)
}