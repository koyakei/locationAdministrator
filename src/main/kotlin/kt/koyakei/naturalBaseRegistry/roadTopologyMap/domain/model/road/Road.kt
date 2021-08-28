package kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.road

/**
 * 長い歩道橋みたいに道路なのか建物なのかわからない場所があるのでインターフェイスにした。
 * 自動運転支援のために使うことになる
 * だから道路の状況については非常に細かく更新する必要がありそう
 * 道路状況は地点別に決めなくてもよいのかなぁ
 * 道路指標の基点からの距離で道路状況を把握するべきか？
 * 道路状況は５分単位での天候情報と、穴が空いたりする地形的な変化は別々のシステムに記録するべきなのかな。
 * 穴は１時間で直るわけでもないし、地形にも影響するよね。
 * 通行可能な車両とかじゃない
 * 車線幅とかはこのサービスに集約
 * 道ってどの単位を一本とするの？車線
 * 道路交通法に基づく管理システムに載せなくていいのか？
 * 境内の中とか私有地も含むから、必ずしも道路交通法の範囲とは言えない
 */
interface Road {

    val roadPavement: RoadPavement

    val roadGeometricRange: RoadGeometricRange
    val laneList: List<Lane>
}