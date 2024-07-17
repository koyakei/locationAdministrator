package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

import kt.koyakei.identityPool.personInLaw.domain.model.Person

interface BusinessOperator {
    fun sellOrProvideAlcohol(person: Drinker) {
        if (person.overAge)
            throw IllegalStateException("20歳未満の者に酒類を販売または供与することはできません")
    }

    fun checkAge() {
        // 年齢確認を行う
    }

    fun implementPreventiveMeasures() {
        // その他の必要な措置を講じる
    }
}