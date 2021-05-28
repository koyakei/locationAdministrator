package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.referendum

data class ReferendumPassedCondition(
    val v可決条件:可決するための賛成の割合,
    // 最低投票数
) {
    @JvmInline
    value class 可決するための賛成の割合(val number: Number)
}
