package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

class 刑事責任年齢判定(
    val 刑事責任年齢: 被告人.Age,
    val v刑事的事実: 刑事的事実
) {


    fun handle() = 有罪無罪判定.刑事的責任の有無((刑事責任年齢 as Long) < v刑事的事実.被告人.age as Long)
}