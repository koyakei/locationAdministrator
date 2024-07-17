package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.action

import kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model.FoodStuff
import kt.koyakei.identityPool.personInLaw.domain.model.Person

interface ObtainFoodStuff : LegalResultPredictor {
    val foodStuff: FoodStuff
    val taker: Person
}