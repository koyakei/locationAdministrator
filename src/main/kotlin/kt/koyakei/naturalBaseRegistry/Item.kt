package kt.koyakei.naturalBaseRegistry

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt

/**
 * 全ての対象に付与される識別子は一意である。
 */
interface Item :ItemWithoutTime{
    override val identifier: Identifier

    interface Identifier : ItemWithoutTime.Identifier {
    }



    val createdAt: CreatedAt

    val vailedAt: VailedAt

    val itemName: ItemName
    interface ItemName{
        val name: String
    }

}



