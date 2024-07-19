package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

interface 契約当事者 : PersonInLaw {
    val debtList: List<kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務>
}