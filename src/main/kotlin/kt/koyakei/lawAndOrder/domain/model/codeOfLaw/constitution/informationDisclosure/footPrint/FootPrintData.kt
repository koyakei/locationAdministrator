package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

import kt.koyakei.personInLawRegister.domain.model.Person
import java.time.ZonedDateTime

/**
 * 情報閲覧をしたら、フットプリントストアに蓄積
 * 誰が読んだの
 * 何を見たの？
 * いつ見たの？
 **/
data class FootPrintData(
    val identifier: Identifier,
    val informationRequester: Person,
    val readAt: RespondedAt,
    val searchRequestedAt: SearchRequestedAt,
) {
    @JvmInline
    value class Identifier(val id : Long)
    @JvmInline
    value class RespondedAt(val zonedDateTime: ZonedDateTime)
    @JvmInline
    value class SearchRequestedAt(val zonedDateTime: ZonedDateTime)
}