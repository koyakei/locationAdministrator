package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

class 有責判定 {
    fun handle(被告人: 被告人) = 刑事責任年齢判定(被告人.age)

    private fun 刑事責任年齢判定( age: 被告人.Age) =  if (age.short >= 刑事責任年齢.short){
        有責(true)
    } else {
        有責(false)
    }


    @JvmInline
    value class 有責(val boolean: Boolean)

    val 刑事責任年齢 = 被告人.Age(14)
}