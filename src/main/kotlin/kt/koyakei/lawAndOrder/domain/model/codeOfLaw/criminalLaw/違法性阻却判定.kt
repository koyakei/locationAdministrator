package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

interface 違法性阻却判定<out T: 刑事的事実> {
    val 事実: T
    fun handle(): 有罪無罪判定.違法性阻却の有無

    @JvmInline
    value class 有責確定済刑事的事実(val any: Any)

}