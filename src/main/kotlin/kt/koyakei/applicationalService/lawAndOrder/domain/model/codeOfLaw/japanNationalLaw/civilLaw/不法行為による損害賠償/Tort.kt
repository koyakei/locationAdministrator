package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償

class Tort(
    val cause: IntentOrNegligence,
    val violatedInterest: LegalInterest,
    val damage: Damage
) {
    fun isLiableForDamages(): Boolean {
        return when (cause) {
            is IntentOrNegligence.Intent, is IntentOrNegligence.Negligence -> true
            else -> {false}
        }
    }

    fun describeViolation(): String {
        return when (violatedInterest) {
            is LegalInterest.Right -> "権利侵害"
            is LegalInterest.ProtectedInterest -> "法律上保護される利益の侵害"
        }
    }

    fun calculateCompensation(): Double {
        return damage.amount
    }
}