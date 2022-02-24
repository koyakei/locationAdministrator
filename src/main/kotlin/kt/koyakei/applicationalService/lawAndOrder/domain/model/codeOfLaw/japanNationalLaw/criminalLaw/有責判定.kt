package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

/**
 * 刑事年齢はすべての罪で責任の要素として判定するはずだがここに入れるのはおかしいのか？
 * 全てに共通する有罪判定の要素は別に書くべきであろう
 */
interface 有責判定 <out T: 刑事的事実> {
    val 事実: T
    val 被告人: 被告人
    val 判定基準List: List<有罪無罪判定.刑事的責任の有無>
    fun handle():有罪無罪判定.刑事的責任の有無



}