package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.civilLaw.debt

class 金銭支払義務(
    override val identifier: 債務.Identifier,
    private val amountOfMoney: Int,
    private val 支払い済み金額: Int,
    override val v債権者: 債務.債権者,
    override val v債務者: 債務.債務者
) : 債務 {
    override val 履行済みかどうか = 債務.履行済み判定(amountOfMoney <= 支払い済み金額)
}