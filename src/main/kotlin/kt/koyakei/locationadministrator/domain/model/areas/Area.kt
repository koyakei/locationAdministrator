package kt.koyakei.core.domain.model.areas

import java.net.URI
import java.net.URL

/**
 * TODO: いちいち　Area<AreaIdentifier>みたいに書くのが重複している　解決できないのか？
 *
 */
interface Area<out T: Area.AreaIdentifier> {
    /**
     * URI は  area://area identifier
     * みたいにする
     * area identifier から生成したい。
     * 生成ロジックもここに書く
     */
    val id: Long
    val areaIdentifier: T
    val name: String
    fun areaURIGenerator(name: String):URL
    interface AreaIdentifier{
        val uri: String
    }
}