package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw.刑罰
import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.naturalBaseRegistry.Item

class 未成年飲酒に対する罰(
    override val identifier: Item.Identifier
, override val createdAt: CreatedAt
) : 刑罰 {
    override val 罰金額Range: IntRange
         = 100..1000
}