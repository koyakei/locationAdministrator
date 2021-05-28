package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.referendum

import kt.koyakei.personRegister.domain.model.PersonInLaw

data class 有権者(val personInLawIdentifierList: List<PersonInLaw.Identifier>)
