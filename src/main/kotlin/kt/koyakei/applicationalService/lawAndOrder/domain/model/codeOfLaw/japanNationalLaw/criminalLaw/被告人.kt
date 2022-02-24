package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

data class 被告人(val identifier: Identifier, val age: Age){
    @JvmInline
    value class Identifier(val long: Long)

    @JvmInline
    value class Age(val short: Short)
}
