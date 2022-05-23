package kt.koyakei.naturalBaseRegistry

interface ItemRepository {
    fun findItem(itemIdentifier: Item.Identifier): Item
}