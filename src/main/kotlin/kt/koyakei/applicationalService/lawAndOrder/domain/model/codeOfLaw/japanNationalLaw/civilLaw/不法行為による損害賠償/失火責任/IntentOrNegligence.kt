package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償.失火責任

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償.IntentOrNegligence

sealed class IntentOrNegligence : IntentOrNegligence { // A class can only extend a sealed class or interface declared in the same package.
    object Intent : IntentOrNegligence

    sealed interface Negligence : IntentOrNegligence {
        object Ordinary : Negligence
        object Gross : Negligence
    }
}
