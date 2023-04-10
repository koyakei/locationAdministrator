package kt.koyakei.nationalBaseRegistry.locationRegister.domain.model

import kt.koyakei.naturalBaseRegistry.Item

interface JapaneseBaseRegisterName: Item.ItemName {
    val kanaName: String
    val romanName: String
    val commonNames: List<String>
}