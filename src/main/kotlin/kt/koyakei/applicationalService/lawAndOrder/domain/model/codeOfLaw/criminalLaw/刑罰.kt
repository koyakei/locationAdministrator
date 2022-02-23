package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.LegalResult

interface 刑罰: LegalResult {
    val 罰金額Range: IntRange
}