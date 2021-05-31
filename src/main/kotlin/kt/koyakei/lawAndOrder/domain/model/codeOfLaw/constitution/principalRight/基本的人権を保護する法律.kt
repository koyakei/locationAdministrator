package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight

import kt.koyakei.lawAndOrder.domain.model.LawAndOrder
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.minimumSocialSecurity.最低限の文化的生活の保証条文
import kt.koyakei.personInLawRegister.domain.model.Person

class 基本的人権を保護する法律( private val person: Person) {

    val 基本的人権保証に関する法律List: List<基本的人権の尊重の具体的基準を決める法律> = listOf(
        最低限の文化的生活の保証条文(person)
    )

    fun hasMinimumRight(person: Person): LawAndOrder.Legal{
        return if(基本的人権保証に関する法律List.all { it.基本的人権が尊重されている() == LawAndOrder.Legal(true) }
                .equals(LawAndOrder.Legal(true))) {
            LawAndOrder.Legal(true)
        } else{
            LawAndOrder.Legal(false)
        }
    }
}