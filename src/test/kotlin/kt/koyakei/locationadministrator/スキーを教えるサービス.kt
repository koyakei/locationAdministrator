package kt.koyakei.locationadministrator

import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.ServiceProvider
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.GeneralItemFeature
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model.service.SkiInstructionService
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeNode
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeRoot
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.ItemTreeVertex

class スキーを教えるサービス {
    fun main(){
        val スキーを教えるサービスの分類 = ItemTreeNode(
            ItemTreeVertex.Identifier(4),
            "スマホ",
            ItemTreeRoot(),
        )
        val スキーを教えるProvider = ServiceProvider(
            Item.Identifier(1),
            listOf(),
            GeneralItemFeature.分類された要素(
                ItemTreeVertex.Identifier(1)
            ),
            "スキーを教える人",
            PersonInLaw.Identifier(1)
            //　量産型のスキースクールに所属するインストラクター　みたいな当て方をするか
        )
        val スキーを教えるサービス = SkiInstructionService(
            Item.Identifier(2),
            listOf(
            ),
            GeneralItemFeature.分類された要素(スキーを教えるサービスの分類.identifier),
            "CARV digital ski coach でスキーを教われるサービス",
            スキーを教えるProvider.identifier
        )
    }

}