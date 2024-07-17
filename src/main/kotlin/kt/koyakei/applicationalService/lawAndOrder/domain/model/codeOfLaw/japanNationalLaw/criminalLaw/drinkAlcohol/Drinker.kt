package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol


interface Drinker: Person{
    fun drink()
    val overAge : Boolean
        get() = age > 20
}