package kt.koyakei.personRegister.domain.model.person

import kt.koyakei.personRegister.domain.model.Person
import kt.koyakei.propertyTreeCategoryRegister.domain.model.unitOfThing.InternetSpeed

/**
 * 基本的人権の個人ごとの状態
 */
data class RightStatus(
    val person: Person,
    val internetSpeed: InternetSpeed,
    val hasHouse: 安全な住居がある
) {
    @JvmInline
    value class 安全な住居がある(val boolean: Boolean)
}
