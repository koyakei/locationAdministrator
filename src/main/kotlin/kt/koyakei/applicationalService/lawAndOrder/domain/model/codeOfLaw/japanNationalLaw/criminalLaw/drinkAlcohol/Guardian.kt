package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

interface Guardian {
    val targetPerson: Person
    fun stopDrinking() {
        println("Stop drinking!")
    }
}
class GuardianImpl(override val targetPerson: Drinker) : Guardian {
    init {
        if (!targetPerson.overAge) {
            stopDrinking()
        }
    }
}