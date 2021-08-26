package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class 有権者(val personInLawIdentifierList: List<PersonInLaw.Identifier>)
