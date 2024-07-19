package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw

/**
 * 債権債務関係だけではない契約の状態があるのじゃないか？　事務管理として
 * 契約の発生主体が法人ではない可能性がある。
 */
interface 契約 {
    @JvmInline
    value class Identifier(val long: Long)

    val identifier: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約.Identifier
    val 契約者当事者List: List<kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約当事者>

    @JvmInline
    value class 契約履行済み(val boolean: Boolean)

    fun 契約履行判定(): kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約.契約履行済み
}