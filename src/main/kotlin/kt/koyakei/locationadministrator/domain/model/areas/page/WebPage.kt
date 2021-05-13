package kt.koyakei.core.domain.model.areas.page

import kt.koyakei.core.domain.model.areas.Area
import java.net.URI
import java.net.URL

class WebPage(
    override val areaIdentifier: WebPageIdentifier, override val id: Long, override val name: String
) : Page<WebPage.WebPageIdentifier> {
    data class WebPageIdentifier(override val uri: String): Page.PageIdentifier{

    }

    override fun areaURIGenerator(name: String) : URL = URL(name)

}