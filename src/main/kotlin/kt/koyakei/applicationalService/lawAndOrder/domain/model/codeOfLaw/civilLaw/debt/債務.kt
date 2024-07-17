package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.debt

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

/**
 * 債務だけで再建が発生しない場合はあるの？
 * 贈与義務ってあったけ？
 */
interface 債務 {
    @JvmInline
    value class Identifier(val long: Long)
    val identifier: Identifier
    @JvmInline
    value class 履行済み判定(val boolean: Boolean)
    val 履行済みかどうか: 履行済み判定

    val v債権者: 債権者
    @JvmInline
    value class 債権者(val personInLawIdentifier: PersonInLaw.Identifier)
    val v債務者: 債務者
    @JvmInline
    value class 債務者(val personInLawIdentifier: PersonInLaw.Identifier)

}