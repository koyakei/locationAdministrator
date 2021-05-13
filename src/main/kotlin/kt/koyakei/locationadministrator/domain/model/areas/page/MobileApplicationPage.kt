package kt.koyakei.core.domain.model.areas.page

import kt.koyakei.core.domain.model.areas.Area
import java.net.URI
import java.net.URL

class MobileApplicationPage(
    override val areaIdentifier: MobileApplicationPageIdentifier, override val id: Long, override val name: String
) : Page<MobileApplicationPage.MobileApplicationPageIdentifier> {

    data class MobileApplicationPageIdentifier(
            override val uri: String
    ): Page.PageIdentifier{

    }

    override fun areaURIGenerator(name: String) : URL = URL(name)
}