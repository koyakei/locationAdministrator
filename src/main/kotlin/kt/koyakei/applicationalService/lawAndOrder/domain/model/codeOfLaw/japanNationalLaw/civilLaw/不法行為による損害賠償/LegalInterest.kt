package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.不法行為による損害賠償

sealed class LegalInterest {
    object Right : LegalInterest()
    object ProtectedInterest : LegalInterest()
}