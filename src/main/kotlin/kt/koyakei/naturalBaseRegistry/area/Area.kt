package kt.koyakei.naturalBaseRegistry.area

import kt.koyakei.naturalBaseRegistry.Item
import java.net.URL

interface Area: Item {
    override val identifier: Identifier
    /**
     * URI は  area://area identifier
     * みたいにする
     * area identifier から生成したい。
     * 生成ロジックもここに書く
     */
    fun areaURIGenerator(name: String):URL
    interface Identifier: Item.Identifier


}