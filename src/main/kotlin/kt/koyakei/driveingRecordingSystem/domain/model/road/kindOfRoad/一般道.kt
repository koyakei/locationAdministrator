package kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.kindOfRoad

import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.Lane
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.Road
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.RoadGeometricRange
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.RoadPavement

class 一般道(override val roadPavement: RoadPavement,
          override val roadGeometricRange: RoadGeometricRange,
          override val laneList: List<Lane>
): Road {
}