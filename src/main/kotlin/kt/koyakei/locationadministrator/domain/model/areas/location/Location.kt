package kt.koyakei.core.domain.model.areas.location

import kt.koyakei.core.domain.model.areas.Area

interface Location<out T :Location.LocationIdentifier> : Area<T> {

    val enterLocationCondition: EnterLocationCondition
    override val areaIdentifier: T

    /**
     * 内側のリストがAND 条件
     * 設定するのが面倒かなと思ったけど、これで行こう
     */
    class EnterLocationCondition(
            val orIBeaconEntityList: List<List<Any>>
    )
    interface LocationIdentifier : Area.AreaIdentifier
}