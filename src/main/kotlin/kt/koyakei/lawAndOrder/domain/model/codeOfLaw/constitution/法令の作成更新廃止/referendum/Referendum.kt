package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.referendum

class Referendum(val referendumPassedCondition: ReferendumPassedCondition) {
    @JvmInline
    value class IsPass(val boolean: Boolean)
}