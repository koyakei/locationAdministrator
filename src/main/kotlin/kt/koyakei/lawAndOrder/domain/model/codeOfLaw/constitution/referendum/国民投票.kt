package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.referendum

class 国民投票 {
    val referendum = Referendum(
        ReferendumPassedCondition(
            ReferendumPassedCondition.可決するための賛成の割合(2 / 3)
        ),
    )

    fun 投票(法案:法案 ,有権者: 有権者): Referendum.IsPass{

        return Referendum.IsPass(true)
    }
}