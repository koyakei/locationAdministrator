package kt.koyakei.baseRegistory.itemTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 *
 */
data class ItemTreeNode(
    override val identifier: ItemTreeVertex.Identifier,
    override val name: String,
    val parentIdentifier: ItemTreeRoot
): ItemTreeVertex

