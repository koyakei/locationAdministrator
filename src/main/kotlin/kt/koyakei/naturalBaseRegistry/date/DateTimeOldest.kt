package kt.koyakei.naturalBaseRegistry.date

import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.naturalBaseRegistry.ItemGeneralization
import kt.koyakei.naturalBaseRegistry.ItemWithoutTime
import java.time.LocalDateTime

class DateTimeOldest (
    override val identifier: Item.Identifier,
    override val parentItemIdentifier: Item.Identifier,
    override val name: Item.ItemName = ItemGeneralization.GeneralItemName(
        "一番昔"
    ),
    val dateTime: LocalDateTime = LocalDateTime.MIN // インターフェイスにして概念ごとに切り替えたほうがいい気がする
) : ItemWithoutTime {
}