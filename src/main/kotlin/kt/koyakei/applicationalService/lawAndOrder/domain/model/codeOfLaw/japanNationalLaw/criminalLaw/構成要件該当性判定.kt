package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

/**
 * 構成要件に該当するかは何罪に当たるのかを人間で当たりをつけてから判定すると良いと思う
 * 罪ごとに判定が出来る実装クラスを持つ
 * 事実も犯罪ごとに用意するのか？
 * 構成要件に該当する判定
 */
interface 構成要件該当性判定{
    val 事実: 刑事的事実

    fun handle(): 有罪無罪判定.構成要件該当性





}