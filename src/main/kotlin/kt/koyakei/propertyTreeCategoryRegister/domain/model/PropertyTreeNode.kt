package kt.koyakei.propertyTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 *
 */
data class PropertyTreeNode(
    override val propertyTreeRootIdentifier: PropertyTreeVertexIdentifier,
    val parentTreeNodeIdentifier: PropertyTreeVertexIdentifier,
): PropertyTreeVertex

