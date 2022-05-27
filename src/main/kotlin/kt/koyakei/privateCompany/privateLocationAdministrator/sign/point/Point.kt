package kt.koyakei.core.domain.model.sign.point
//
import kt.koyakei.core.domain.model.position.GeometricExistenceInfo
import kt.koyakei.core.domain.model.sign.Sign
import java.net.URI

data class Point(val geometricExistenceInfo: GeometricExistenceInfo,
                 override val uri: URI,
                 val receiveMessageConditions: String, override val id: Long
) : Sign {

}