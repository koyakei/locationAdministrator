package kt.koyakei.naturalBaseRegistry

interface ItemGeneralization {
    class GeneralItemName(override val name: String): Item.ItemName {

    }

}