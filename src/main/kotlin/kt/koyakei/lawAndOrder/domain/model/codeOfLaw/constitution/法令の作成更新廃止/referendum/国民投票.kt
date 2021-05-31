package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.referendum

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote.有権者
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.法案

class 国民投票(private val 国民投票Service: 国民投票Service) {
    val referendum = Referendum(
        ReferendumPassedCondition(
            ReferendumPassedCondition.可決するための賛成の割合(2 / 3)
        ),
    )

    fun 投票(法案: 法案, 有権者: 有権者): Referendum.IsPass{

        return Referendum.IsPass(true)
    }
}