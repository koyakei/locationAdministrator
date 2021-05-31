package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote.bill

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote.投票券
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class 未投票投票券(val 投票券Identifier: 投票券.Identifier,
                  val voterIdentifier: PersonInLaw.Identifier)
