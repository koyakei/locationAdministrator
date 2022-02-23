package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.LegalResult

interface LegalResultPredictor {
    fun handle():PredictedLegalResult
}