package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class 被告人(val identifier: PersonInLaw.Identifier, val age: Age){
    @JvmInline
    value class Identifier(val long: Long)

    @JvmInline
    value class Age(val short: Short)
}
