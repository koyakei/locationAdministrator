package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

class VoteAction(
    val 投票キャンペーン: 投票キャンペーン,
    val voteService: VoteService,
) {
    fun vote(投票先: 投票券.投票先, voter: PersonInLaw.Identifier){
        voteService.saveVote(createVoteTicketIdentifier(),voter,投票先)
    }
    private fun createVoteTicketIdentifier():投票券.Identifier{
        return 投票券.Identifier(1)
    }
}