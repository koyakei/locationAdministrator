package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.trafficLaw

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class 法定速度遵守義務(
    val 義務履行者: PersonInLaw,
    val 法定速度: Long,
    ) {
    fun handle() =
        道路交通法.道路交通法遵守(true)

}