package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action

import kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.FoodStuff
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.LegalResult
import kt.koyakei.personInLawRegister.domain.model.Person

interface ObtainFoodStuff : LegalResultPredictor {
    val foodStuff: FoodStuff
    val taker: Person
}