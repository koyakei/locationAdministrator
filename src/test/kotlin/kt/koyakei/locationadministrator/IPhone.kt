package kt.koyakei.locationadministrator

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.propertyRegister.domain.GeneralItemFeature
import kt.koyakei.propertyRegister.domain.Maker
import kt.koyakei.propertyRegister.domain.GeneralPropertyItem
import kt.koyakei.propertyRegister.domain.従属する要素の実体
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeNode
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeRoot
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeVertex

/**
 * Iphone を定義するテスト
 */
class IPhone {
    fun main() {
        val スマホtouchPanelの分類 = PropertyTreeNode(
            PropertyTreeVertex.Identifier(2),
            "タッチパネル",
            PropertyTreeRoot(),
        )
        val スマホのタッチパネル = GeneralPropertyItem(
            GeneralItemFeature.Identifier(2),
            listOf(),
            GeneralItemFeature.分類された要素(スマホtouchPanelの分類.identifier),
            "スマホのタッチパネル",
            Maker(PersonInLaw.Identifier(1))
        )

        val ひとつの製品に含まれるスマホのタッチパネル部品の状態 = 従属する要素の実体(
            従属する要素の実体.Amount(1),
            スマホのタッチパネル.identifier
        )

        val スマホ分類された要素v = PropertyTreeNode(
            PropertyTreeVertex.Identifier(4),
            "スマホ",
            PropertyTreeRoot(),
        )
// このモデルの電池の電圧はいくつなんだろう　電池の電圧で比較したい場合は？
        //電池クラスを作るしかないの？電池クラスを作ってみるか

        val IPhone = GeneralPropertyItem(
            GeneralItemFeature.Identifier(2),
            listOf(
                ひとつの製品に含まれるスマホのタッチパネル部品の状態
            ),
            GeneralItemFeature.分類された要素(スマホ分類された要素v.identifier),
            "IPhone SE 1st gen",
            Maker(PersonInLaw.Identifier(1))
        )
    }
}