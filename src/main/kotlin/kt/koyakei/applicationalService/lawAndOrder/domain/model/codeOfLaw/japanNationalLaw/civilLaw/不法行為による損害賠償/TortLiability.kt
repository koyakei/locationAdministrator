package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償

class TortLiability(private val tort: Tort) {
    fun assertLiability() {
        if (tort.isLiableForDamages()) {
            println("不法行為が成立します。")
            println("侵害の種類: ${tort.describeViolation()}")
            println("賠償額: ${tort.calculateCompensation()}円")
        } else {
            println("不法行為は成立しません。")
        }
    }
}