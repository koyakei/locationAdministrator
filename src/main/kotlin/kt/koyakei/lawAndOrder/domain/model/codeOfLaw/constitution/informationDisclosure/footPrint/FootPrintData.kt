package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

import kt.koyakei.personRegister.domain.model.Person
import java.time.ZonedDateTime

/**
 * 情報閲覧をしたら、フットプリントストアに蓄積
 * 誰が読んだの
 * 何を見たの？
 * いつ見たの？
 **/
data class FootPrintData(
    val identifier: Identifier,
    val person: Person,
    val targetInformation: Any,
    val readAt: ReadAt,

) {
    @JvmInline
    value class Identifier(val id : Long)
    @JvmInline
    value class ReadAt(val zonedDateTime: ZonedDateTime)
}