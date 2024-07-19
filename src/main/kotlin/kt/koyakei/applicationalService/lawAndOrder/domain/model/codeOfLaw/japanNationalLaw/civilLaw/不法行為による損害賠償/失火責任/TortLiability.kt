package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償.失火責任

class TortLiability(private val tort: Tort) {
    fun assertLiability() {
        if (tort.isLiableForDamages()) {
            println("不法行為が成立します。")
            println("侵害の種類: ${tort.describeViolation()}")
            println("賠償額: ${tort.calculateCompensation()}円")
            if (tort.damage.isCausedByFire) {
                when (tort.cause) {
                    is IntentOrNegligence.Intent -> println("故意による失火のため、民法第709条が適用されます。")
                    is IntentOrNegligence.Negligence.Gross -> println("重大な過失による失火のため、失火責任法の例外として損害賠償責任があります。")
                    else -> {} // This case should never occur due to isLiableForDamages() check
                }
            }
        } else {
            println("不法行為は成立しません。")
            if (tort.damage.isCausedByFire && tort.cause is IntentOrNegligence.Negligence.Ordinary) {
                println("軽過失による失火のため、失火責任法により損害賠償責任はありません。")
            }
        }
    }
}