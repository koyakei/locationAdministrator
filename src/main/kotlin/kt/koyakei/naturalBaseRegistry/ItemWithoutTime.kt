package kt.koyakei.naturalBaseRegistry

interface ItemWithoutTime{
    val identifier: Identifier
    val parentItemIdentifier: Item.Identifier
    val name: Item.ItemName

    interface Identifier{
        val long:Long
    }

}