package kt.koyakei.naturalBaseRegistry


object RootItem: ItemWithoutTime{
    override val identifier: Item.Identifier
        get() = RootIdentifier
    override val parentItemIdentifier: Item.Identifier
        get() = AbsoluteNothingIdentifier
    override val name: Item.ItemName
        get() = Item.GeneralItemName("the root")

    object RootIdentifier: Item.Identifier {
        override val long: Long
            get() = 1
    }

    object AbsoluteNothingIdentifier: Item.Identifier {
        override val long: Long
            get() = 0
    }

}
