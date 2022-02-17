package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.referendum

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote.VoteService
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote.投票券
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class 国民投票Service: VoteService {
    override fun saveVote(投票券Identifier: 投票券.Identifier, voter: PersonInLaw.Identifier, 投票先: 投票券.投票先): 投票券.投票済 {
        TODO("Not yet implemented")
    }
}