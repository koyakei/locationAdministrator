package kt.koyakei.core.domain.model.valueObject.positioning.topology

import kt.koyakei.core.domain.model.position.GeometricExistenceInfo

class GeometricCircle(val centerGeometricPointInfo: GeometricPointInfo,
                      val diameter: Float) : GeometricExistenceInfo {

    fun isInside(geometricExistenceInfo: GeometricExistenceInfo) {

    }

    fun isWrapped(geometricExistenceInfo: GeometricExistenceInfo) {

    }

}