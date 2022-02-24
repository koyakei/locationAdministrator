package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw

/**
 * 立件した単位に紐付かない刑事的事実
 *
 */
interface 刑事的事実{

    val identifier: Identifier
    val 被告人: 被告人
    val v内容: 刑事的事実.内容

    @JvmInline
    value class Identifier(val long: Long)

    interface 内容{

    }


}
