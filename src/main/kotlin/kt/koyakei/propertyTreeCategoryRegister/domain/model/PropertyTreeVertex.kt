package kt.koyakei.propertyTreeCategoryRegister.domain.model

/**
 * 動産　不動産　問わない
 * カテゴリーのツリーだけはこれにしておく。　末端ノードを具体的な製品情報として扱っても矛盾しないだろう。
 * ツリー構造だけ保ここに入れて、それぞれの　表形式は　別システムにするか
 */
interface PropertyTreeVertex{
    val identifier: Identifier
    val name: String

    @JvmInline
    value class Identifier(
        val id: Long
    )
}



