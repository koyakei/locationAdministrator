package kt.koyakei.core.domain.model.actor.administrator

/**
 * システム管理者
 * ロールでわけるかな。
 */
class Administrator(
    val id: Long,
    val role: Role
) {

    enum class Role {
        Admin,
        User
    }
}