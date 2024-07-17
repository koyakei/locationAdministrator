package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

interface Corporation {
    var representative: Person
    val employees: List<Person>
    fun conductBusiness() {
        // 業務を行う
    }
}