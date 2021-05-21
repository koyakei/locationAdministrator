package kt.koyakei.core.domain.model.areas.location

interface Location {

    val enterLocationCondition: EnterLocationCondition

    /**
     * 内側のリストがAND 条件
     * 設定するのが面倒かなと思ったけど、これで行こう
     */
    class EnterLocationCondition(
            val orIBeaconEntityList: List<List<Any>>
    )

}