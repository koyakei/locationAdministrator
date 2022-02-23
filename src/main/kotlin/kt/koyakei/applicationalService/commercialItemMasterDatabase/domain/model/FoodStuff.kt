package kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item

interface FoodStuff : Item{
    val ingredientList: List<Item>
    val isAlcohol: Boolean
}