package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt

/**
 * TODO: 給与債権を法定通貨で払う義務を表現してみよう
 */
class 金銭支払義務(
    override val identifier: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務.Identifier,
    private val amountOfMoney: Int,
    private val 支払い済み金額: Int,
    override val v債権者: _root_ide_package_.kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務.債権者,
    override val v債務者: _root_ide_package_.kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務.債務者
) : _root_ide_package_.kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務 {
    override val 履行済みかどうか =
        _root_ide_package_.kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.債務.履行済み判定(
            amountOfMoney <= 支払い済み金額
        )
}