package kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model

import kt.koyakei.naturalBaseRegistry.Item

interface FoodStuff : Item {
    val ingredientList: List<Item>
    val isAlcohol: Boolean
}