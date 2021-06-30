package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

interface 有責判定 <out T: 刑事的事実> {
    val 事実: T
    val 被告人: 被告人
    val 判定基準List: List<有罪無罪判定.刑事的責任の有無>
    fun handle():有罪無罪判定.刑事的責任の有無 = 有罪無罪判定.刑事的責任の有無(判定基準List.all { it == 有罪無罪判定.刑事的責任の有無(true) })

    fun 刑事責任年齢判定():有罪無罪判定.刑事的責任の有無

    val 刑事責任年齢: 被告人.Age
        //get() = 被告人.Age(14)
}