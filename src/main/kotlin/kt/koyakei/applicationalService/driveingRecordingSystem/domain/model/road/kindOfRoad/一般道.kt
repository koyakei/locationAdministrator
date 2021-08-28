package kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road.kindOfRoad

import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road.Lane
import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road.Road
import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road.RoadGeometricRange
import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road.RoadPavement

class 一般道(override val roadPavement: RoadPavement,
          override val roadGeometricRange: RoadGeometricRange,
          override val laneList: List<Lane>
): Road {
}