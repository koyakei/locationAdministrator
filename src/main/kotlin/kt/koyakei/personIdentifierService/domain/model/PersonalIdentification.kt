package kt.koyakei.personIdentifierService.domain.model

import java.time.ZonedDateTime

interface PersonalIdentification {
    val evidence: Any
    @JvmInline
    value class RecordedAt(val zonedDateTime: ZonedDateTime)
    val recordedAt: RecordedAt

}