package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action.PredictedLegalResult
import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.naturalBaseRegistry.Item
import java.time.LocalDateTime

class IsGuilty(
    val boolean: Boolean,
) : PredictedLegalResult