package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location

interface LocationEnterable {

    val enterLocationCondition: EnterLocationCondition
    /**
     * 内側のリストがAND 条件
     * 設定するのが面倒かなと思ったけど、これで行こう
     */
    class EnterLocationCondition(
            val orIBeaconEntityList: List<List<Any>>
    )
}