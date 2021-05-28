package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.referendum

class Referendum(val referendumPassedCondition: ReferendumPassedCondition) {
    @JvmInline
    value class IsPass(val boolean: Boolean)
}