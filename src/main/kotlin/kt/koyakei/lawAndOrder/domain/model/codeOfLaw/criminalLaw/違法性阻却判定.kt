package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

interface 違法性阻却判定 {
    fun handle(有責確定済刑事的事実:有責確定済刑事的事実 ): 違法性阻却あり

    @JvmInline
    value class 有責確定済刑事的事実(val any: Any)

    @JvmInline
    value class 違法性阻却あり(val boolean: Boolean)
}