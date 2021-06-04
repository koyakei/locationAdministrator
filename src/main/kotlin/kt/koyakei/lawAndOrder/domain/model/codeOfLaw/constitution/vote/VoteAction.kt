package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class VoteAction(
    val 投票キャンペーン: 投票キャンペーン,
    val voteService: VoteService,
) {
    fun vote(投票先: 投票先, voter:PersonInLaw.Identifier){
        voteService.saveVote()
    }
}