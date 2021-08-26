package kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.kindOfRoad

import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.Lane
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.Road
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.RoadGeometricRange
import kt.koyakei.baseRegistory.geometricMap.domain.model.artifact.road.RoadPavement

class 高速道路(val laneList: List<Lane>,
           override val roadPavement: RoadPavement,
           override val roadGeometricRange: RoadGeometricRange
): Road {


}