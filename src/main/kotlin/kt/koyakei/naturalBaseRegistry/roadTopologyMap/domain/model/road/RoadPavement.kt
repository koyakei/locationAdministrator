package kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road

/**
 * 不正常な状態じゃなくて、正常な状態を登録しておこうか。
 * 恒久的に道路が壊れっぱなしになるとか、そういうことになるなら、
 * 地形データにも入れよう
 */
enum class RoadPavement {
    高速道路規格舗装,
    Nothing,
    通常道路舗装,
    飛行機用滑走路,
    砂利,
    レンガ,
    慣らした土,
    岩,

}