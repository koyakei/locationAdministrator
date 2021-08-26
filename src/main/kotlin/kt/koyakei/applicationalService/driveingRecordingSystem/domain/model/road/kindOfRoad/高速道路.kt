package kt.koyakei.baseRegistory.roadTopologyMap.domain.model.road.kindOfRoad

import kt.koyakei.baseRegistory.roadTopologyMap.domain.model.road.Lane
import kt.koyakei.baseRegistory.roadTopologyMap.domain.model.road.Road
import kt.koyakei.baseRegistory.roadTopologyMap.domain.model.road.RoadGeometricRange
import kt.koyakei.baseRegistory.roadTopologyMap.domain.model.road.RoadPavement

class 高速道路(val laneList: List<Lane>,
           override val roadPavement: RoadPavement,
           override val roadGeometricRange: RoadGeometricRange
): Road {


}