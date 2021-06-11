package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

data class 被告人(val identifier: Identifier, val age: Age){
    @JvmInline
    value class Identifier(val long: Long)

    @JvmInline
    value class Age(val short: Short)
}
