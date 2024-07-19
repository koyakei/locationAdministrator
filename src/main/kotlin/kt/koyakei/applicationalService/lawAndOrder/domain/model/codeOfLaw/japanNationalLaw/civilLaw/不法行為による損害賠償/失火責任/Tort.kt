package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償.失火責任

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償.LegalInterest

class Tort(
    val cause: IntentOrNegligence,
    val violatedInterest: LegalInterest,
    val damage: Damage
) {
    fun isLiableForDamages(): Boolean {
        return when {
            damage.isCausedByFire && cause is IntentOrNegligence.Negligence.Ordinary -> false
            else -> true
        }
    }

    fun describeViolation(): String {
        return when (violatedInterest) {
            is LegalInterest.Right -> "権利侵害"
            is LegalInterest.ProtectedInterest -> "法律上保護される利益の侵害"
        }
    }

    fun calculateCompensation(): Double {
        return if (isLiableForDamages()) damage.amount else 0.0
    }
}