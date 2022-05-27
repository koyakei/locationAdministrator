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

    /**
     * すべての背後にある相対無を表現したいなら0
     * RDBを使うならルートの自己参照で１
     * ネットワークDBなら0オブジェクトを作る
     */
    object AbsoluteNothingIdentifier: Item.Identifier {
        override val long: Long
            get() = 0
    }

}
