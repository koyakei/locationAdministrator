package kt.koyakei.core.domain.model.sign

import java.net.URI

class Button(
        val style: String,
        override val uri: URI, override val id: Long
) : Sign {

}