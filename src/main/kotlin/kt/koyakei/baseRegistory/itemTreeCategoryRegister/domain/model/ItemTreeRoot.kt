package kt.koyakei.baseRegistory.itemTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 *
 */
class ItemTreeRoot()
    : ItemTreeVertex {
    override val name: String = "大本"

    override val identifier: ItemTreeVertex.Identifier = ItemTreeVertex.Identifier(1)
    }

