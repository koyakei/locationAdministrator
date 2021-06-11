package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

/**
 * 構成要件に該当するかは何罪に当たるのかを人間で当たりをつけてから判定すると良いと思う
 */
class 有罪無罪判定(private val 構成要件該当性判定: 構成要件該当性判定,
private val 違法性阻却判定: 違法性阻却判定,
private val 有責判定: 有責判定) {
    fun handle(v刑事的事実: 刑事的事実): 刑事的合法性{
        //TODO:チェインする順番を型で保証するべきだと思う
        if(構成要件該当性判定.handle(v刑事的事実.v事実 as 構成要件該当性判定.構成要件判定用事実) ==
            kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.構成要件該当性判定.構成要件に該当する(false)){
            return 刑事的合法性(true)
        }
        if(
            違法性阻却判定.handle(v刑事的事実.v事実 as 違法性阻却判定.有責確定済刑事的事実) ==
                    kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.違法性阻却判定.違法性阻却あり(true)
        ){
            return 刑事的合法性(true)
        }
        if(有責判定.handle(v刑事的事実.被告人) ==
            kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有責判定.有責(false)){
            return 刑事的合法性(true)
        }
        return 刑事的合法性(false)
    }

    @JvmInline
    value class 刑事的合法性( val boolean: Boolean)

}