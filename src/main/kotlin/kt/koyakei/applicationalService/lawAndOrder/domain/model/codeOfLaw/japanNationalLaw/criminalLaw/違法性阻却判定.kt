package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

interface 違法性阻却判定 {
    val 事実: 刑事的事実
    fun handle(): 有罪無罪判定.違法性阻却の有無

    @JvmInline
    value class 有責確定済刑事的事実(val any: Any)

}