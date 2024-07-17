package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

import kt.koyakei.identityPool.personInLaw.domain.model.Person

interface Person :Person{

    fun actAsAgent() {
        // 代理人として行動する
    }

    fun work() {
        // 従業者として働く
    }
}