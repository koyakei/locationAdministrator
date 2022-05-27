package kt.koyakei.core.domain.model.actor.locationOwner


/**
 * ロケーションのオーナー
 * 鉄道車両など動くもののオーナーも含む
 */
interface LocationOwner {
    val name: String
    val id: Long
}