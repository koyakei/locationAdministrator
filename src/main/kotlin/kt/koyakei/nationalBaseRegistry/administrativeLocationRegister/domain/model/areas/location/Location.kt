package kt.koyakei.core.domain.model.areas.location

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.Area

interface Location<T: Location.Identifier> : Area<T> {
    override val identifier: T
    interface Identifier: Area.Identifier
    val enterLocationCondition: EnterLocationCondition

    /**
     * 内側のリストがAND 条件
     * 設定するのが面倒かなと思ったけど、これで行こう
     */
    class EnterLocationCondition(
            val orIBeaconEntityList: List<List<Any>>
    )

}