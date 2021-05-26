package kt.koyakei.socialSecurity.domain.model.sosialSecurityPolicy


/**
 *
 */
data class SocialSecurityPolicy(
    val socialSecurityPolicyIdentifier: SocialSecurityPolicyIdentifier,
) {
    @JvmInline
    value class SocialSecurityPolicyIdentifier(val id: Long)
}


