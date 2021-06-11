package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw

/**
 * 立件した単位に紐付かない刑事的事実
 *
 */
data class 刑事的事実(val identifier: Identifier,
val 被告人: 被告人,
val v事実: 刑事的事実.事実){

    @JvmInline
    value class Identifier(val long: Long)

    @JvmInline
    value class 事実( val any: Any)
}
