package kt.koyakei.locationadministrator

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.propertyRegister.domain.*
import kt.koyakei.propertyRegister.domain.concreat.service.SkiInstructionService
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeNode
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeRoot
import kt.koyakei.propertyTreeCategoryRegister.domain.model.PropertyTreeVertex

class スキーを教えるサービス {
    fun main(){
        val スキーを教えるサービスの分類 = PropertyTreeNode(
            PropertyTreeVertex.Identifier(4),
            "スマホ",
            PropertyTreeRoot(),
        )
        val スキーを教えるProvider = ServiceProvider(
            GeneralItemFeature.Identifier(1),
            listOf(),
            GeneralItemFeature.分類された要素(
                PropertyTreeVertex.Identifier(1)
            ),
            "スキーを教える人",
            PersonInLaw.Identifier(1)
            //　量産型のスキースクールに所属するインストラクター　みたいな当て方をするか
        )
        val スキーを教えるサービス = SkiInstructionService(
            GeneralItemFeature.Identifier(2),
            listOf(
            ),
            GeneralItemFeature.分類された要素(スキーを教えるサービスの分類.identifier),
            "CARV digital ski coach でスキーを教われるサービス",
            スキーを教えるProvider.identifier
        )
    }

}