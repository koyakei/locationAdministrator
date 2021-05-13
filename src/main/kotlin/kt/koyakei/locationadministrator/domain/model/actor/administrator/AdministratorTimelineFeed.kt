package kt.koyakei.core.domain.model.actor.administrator

import java.time.LocalDateTime

/**
 * タイムラインのデータ
 * フィードの中にはスレッドがある。
 * ロールごとに違うのだから、
 */
class AdministratorTimelineFeed(
    private val timelineThreadList: List<TimelineThread>
) {
    class TimelineThread(val localDateTime: LocalDateTime){
        fun reaction(administrator: Administrator) {}
    }
}