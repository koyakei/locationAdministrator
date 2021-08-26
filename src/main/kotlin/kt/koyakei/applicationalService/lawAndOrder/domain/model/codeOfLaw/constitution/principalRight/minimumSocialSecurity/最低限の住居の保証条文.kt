package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.minimumSocialSecurity

import kt.koyakei.applicationalService.lawAndOrder.domain.model.LawAndOrder
import kt.koyakei.personInLawRegister.domain.model.Person
import kt.koyakei.legacyService.戸籍Service.model.domain.person.RightStatus

/**
 * すべての人はインターネット接続をできる権利を有する。
 * 接続速度を個別の法律で定めたら、それの変更がでんぱするように作る
 */
class 最低限の住居の保証条文(
    private val person: Person
) : LawAndOrder {
    fun hasRight() = person.rightStatus.hasHouse == RightStatus.安全な住居がある(true)
}
