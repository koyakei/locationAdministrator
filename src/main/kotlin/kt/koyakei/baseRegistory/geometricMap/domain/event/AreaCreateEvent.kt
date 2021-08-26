package kt.koyakei.baseRegistory.geometricMap.domain.event

import kt.koyakei.baseRegistory.geometricMap.domain.model.GeometricRange

data class AreaCreateEvent(
    val geometricRange: GeometricRange,
    )
