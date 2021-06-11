package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

/**
 * 構成要件に該当するかは何罪に当たるのかを人間で当たりをつけてから判定すると良いと思う
 * 罪ごとに判定が出来る実装クラスを持つ
 * 事実も犯罪ごとに用意するのか？
 */
interface 構成要件該当性判定 {

    fun handle(構成要件判定用事実: 構成要件判定用事実): 構成要件に該当する

    @JvmInline
    value class 構成要件判定用事実(val any: Any)

    @JvmInline
    value class 構成要件に該当する(val boolean: Boolean)
}