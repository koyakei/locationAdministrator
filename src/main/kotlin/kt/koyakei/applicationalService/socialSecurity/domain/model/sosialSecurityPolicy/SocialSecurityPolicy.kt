package kt.koyakei.applicationalService.socialSecurity.domain.model.sosialSecurityPolicy


/**
 *
 */
data class SocialSecurityPolicy(
    val socialSecurityPolicyIdentifier: SocialSecurityPolicyIdentifier,
) {
    @JvmInline
    value class SocialSecurityPolicyIdentifier(val id: Long)
}


