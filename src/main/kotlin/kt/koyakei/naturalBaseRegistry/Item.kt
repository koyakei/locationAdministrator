package kt.koyakei.naturalBaseRegistry

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

/**
 * 全ての対象に付与される識別子は一意である。
 */
interface Item :ItemWithoutTime{

    interface Identifier {
        val long: Long
    }



    val createdAt: CreatedAt

    val vailedAt: VailedAt
    interface ItemName{
        val string: String
    }

    class GeneralItemName(override val string: String):ItemName {

    }
}

interface ItemWithoutTime{
    val identifier: Item.Identifier
    val parentItemIdentifier: Item.Identifier
    val name: Item.ItemName
}



