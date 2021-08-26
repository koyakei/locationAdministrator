package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

interface VoteService {
    fun saveVote(投票券Identifier: 投票券.Identifier, 投票先: 投票先): 投票券.投票済

}