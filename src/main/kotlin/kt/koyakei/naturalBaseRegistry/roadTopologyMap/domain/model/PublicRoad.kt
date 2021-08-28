package kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model

class PublicRoad(
    override val identifier: Road.Identifier,
    override val name: Road.Name,
    override val startedFrom: Road.StartedFrom,
    override val endTo: Road.EndTo,
    override val velocityLimit: Long
) : Road, 道路交通法上の道路 {
}