package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.responsibility

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface 刑事的注意義務 {
    val 義務履行者: PersonInLaw
    val content: Any
}