package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action.PredictedLegalResult
import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import java.time.LocalDateTime

class IsGuilty(override val identifier: Item.Identifier = Item.Identifier(2)
               , override val createdAt: CreatedAt = CreatedAt(LocalDateTime.MIN), val boolean: Boolean) :PredictedLegalResult {

}