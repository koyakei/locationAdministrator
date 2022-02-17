package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface VoteService {
    fun saveVote(投票券Identifier: 投票券.Identifier,
                 voter: PersonInLaw.Identifier,
                 投票先: 投票券.投票先): 投票券.投票済

}