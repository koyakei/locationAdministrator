package kt.koyakei.administrativeLocationRegister.domain.model.areas

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
    val id: AreaIdentifier
    val areaIdentifier: T
    val name: AreaName
    fun areaURIGenerator(name: String):URL
    @JvmInline
    value class AreaIdentifier(val uri: String)

    @JvmInline
    value class AreaName(val id: String)


}