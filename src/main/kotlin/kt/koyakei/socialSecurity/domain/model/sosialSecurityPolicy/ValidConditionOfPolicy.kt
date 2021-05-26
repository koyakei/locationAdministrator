package kt.koyakei.socialSecurity.domain.model.sosialSecurityPolicy

import java.util.*

data class ValidConditionOfPolicy(
    val validConditionOfPolicyIdentifier: ValidConditionOfPolicyIdentifier,
    val validAt: ValidAt,
    val expiredAt: ExpiredAt,
) {
    @JvmInline
    value class ValidConditionOfPolicyIdentifier(val id: Long)

    @JvmInline
    value class ExpiredAt(val date: Date)

    @JvmInline
    value class ValidAt(val date: Date)
}


