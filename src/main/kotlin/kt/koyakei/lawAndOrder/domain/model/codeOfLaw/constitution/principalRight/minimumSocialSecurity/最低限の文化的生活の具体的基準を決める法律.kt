package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.minimumSocialSecurity

import kt.koyakei.lawAndOrder.domain.model.LawAndOrder
import kt.koyakei.personInLawRegister.domain.model.Person

interface 最低限の文化的生活の具体的基準を決める法律 {
    val person: Person
    fun hasMinimumRight(): LawAndOrder.Legal
}