package kt.koyakei.locationadministrator

import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.GeneralItemFeature
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.Maker
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.GeneralPropertyItem
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.従属する要素の実体
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeNode
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeRoot
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeVertex
import org.springframework.boot.test.context.SpringBootTest

/**
 * Iphone を定義するテスト
 */
@SpringBootTest
class IPhone {
    fun main() {
        val スマホtouchPanelの分類 = ItemTreeNode(
            ItemTreeVertex.Identifier(2),
            "タッチパネル",
            ItemTreeRoot(),
        )
        val スマホのタッチパネル = GeneralPropertyItem(
            GeneralPropertyItem.GeneralIdentifier(2),
            listOf(),
            GeneralItemFeature.分類された要素(スマホtouchPanelの分類.identifier),
            "スマホのタッチパネル",
            Maker(PersonInLaw.Identifier(1))
        )

        val ひとつの製品に含まれるスマホのタッチパネル部品の状態 = 従属する要素の実体(
            従属する要素の実体.Amount(1),
            スマホのタッチパネル.identifier
        )

        val スマホ分類された要素v = ItemTreeNode(
            ItemTreeVertex.Identifier(4),
            "スマホ",
            ItemTreeRoot(),
        )
// このモデルの電池の電圧はいくつなんだろう　電池の電圧で比較したい場合は？
        //電池クラスを作るしかないの？電池クラスを作ってみるか

        val IPhone = GeneralPropertyItem(
            GeneralPropertyItem.GeneralIdentifier(2),
            listOf(
                ひとつの製品に含まれるスマホのタッチパネル部品の状態
            ),
            GeneralItemFeature.分類された要素(スマホ分類された要素v.identifier),
            "IPhone SE 1st gen",
            Maker(PersonInLaw.Identifier(1))
        )
    }
}