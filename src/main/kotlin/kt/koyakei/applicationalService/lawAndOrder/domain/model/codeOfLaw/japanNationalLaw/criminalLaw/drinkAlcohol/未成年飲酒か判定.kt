package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

import kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.AlcoholFoodStuff
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action.ObtainFoodStuff
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action.PredictedLegalResult
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.IsGuilty
import kt.koyakei.personInLawRegister.domain.model.Person

class 未成年飲酒か判定(override val foodStuff: AlcoholFoodStuff, override val taker: Person) : ObtainFoodStuff {
    override fun handle(): PredictedLegalResult {
        return if (taker.age.toFloat() > 20){
            kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.IsGuilty(
                boolean = false
            )
        } else {
            kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.IsGuilty(
                boolean = true
            )
        }
    }


}