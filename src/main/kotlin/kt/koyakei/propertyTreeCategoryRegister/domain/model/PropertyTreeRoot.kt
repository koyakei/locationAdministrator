package kt.koyakei.propertyTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 *
 */
class PropertyTreeRoot()
    :PropertyTreeVertex{
    override val name: String = "大本"

    override val identifier: PropertyTreeVertex.Identifier = PropertyTreeVertex.Identifier(1)
    }

