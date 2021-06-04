package kt.koyakei.geometricMap.domain.event

import kt.koyakei.geometricMap.domain.model.GeometricRange

data class AreaCreateEvent(
    val geometricRange: GeometricRange,
    )
