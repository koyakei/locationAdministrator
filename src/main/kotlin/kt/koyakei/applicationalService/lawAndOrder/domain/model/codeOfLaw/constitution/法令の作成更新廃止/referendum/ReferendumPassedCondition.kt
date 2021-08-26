package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.referendum

data class ReferendumPassedCondition(
    val v可決条件:可決するための賛成の割合,
    // 最低投票数
) {
    @JvmInline
    value class 可決するための賛成の割合(val number: Number)
}
