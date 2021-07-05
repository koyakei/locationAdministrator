package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.civilLaw

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.civilLaw.debt.債務
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface 契約当事者 : PersonInLaw{
    val debtList: List<債務>
}