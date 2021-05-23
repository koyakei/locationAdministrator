package kt.koyakei.propertyTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 *
 */
interface PropertyTreeVertex{
    val propertyTreeRootIdentifier: PropertyTreeVertexIdentifier
}


interface PropertyTreeVertexIdentifier{
    val id: Long
}
