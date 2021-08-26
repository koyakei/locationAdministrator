package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.minimumSocialSecurity

import kt.koyakei.applicationalService.lawAndOrder.domain.model.LawAndOrder
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.基本的人権の尊重の具体的基準を決める法律
import kt.koyakei.personInLawRegister.domain.model.Person

class 最低限の文化的生活の保証条文(val person: Person) : 基本的人権の尊重の具体的基準を決める法律, LawAndOrder {

    val 最低限の文化的生活を保証する法律List: List<最低限の文化的生活の具体的基準を決める法律> = listOf(
        インターネット接続の保証に関する法律(person)
    )

    override fun 基本的人権が尊重されている(): LawAndOrder.Legal =
        LawAndOrder.Legal(最低限の文化的生活を保証する法律List.all { it.hasMinimumRight() == LawAndOrder.Legal(true) })
}