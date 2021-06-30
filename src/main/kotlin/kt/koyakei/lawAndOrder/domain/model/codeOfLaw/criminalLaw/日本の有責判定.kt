package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

 class 日本の有責判定(
     val 被告人: 被告人,
     val 刑事責任年齢: 被告人.Age) {

     val 判定基準List: List<有罪無罪判定.刑事的責任の有無> = listOf(
         刑事責任年齢判定()
     )

     fun 刑事責任年齢判定() =
         有罪無罪判定.刑事的責任の有無(被告人.age.short >= 刑事責任年齢.short)
//     fun 責任能力() =

 }