package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import java.net.URL

interface Area: Item {
    override val identifier: Identifier
    /**
     * URI は  area://area identifier
     * みたいにする
     * area identifier から生成したい。
     * 生成ロジックもここに書く
     */
    val name: AreaName
    fun areaURIGenerator(name: String):URL
    interface Identifier:Item.Identifier

    @JvmInline
    value class AreaName(val id: String)


}