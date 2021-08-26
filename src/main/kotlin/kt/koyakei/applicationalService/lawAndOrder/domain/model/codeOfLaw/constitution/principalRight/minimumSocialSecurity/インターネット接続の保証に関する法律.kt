package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.principalRight.minimumSocialSecurity

import kt.koyakei.applicationalService.lawAndOrder.domain.model.LawAndOrder
import kt.koyakei.personInLawRegister.domain.model.Person
import kt.koyakei.baseRegistory.itemTreeCategoryRegister.domain.model.unitOfThing.InternetSpeed

/**
 * 法律は有効期限とか権利の条件を作るべきで、権利そのものは他のクラスに任せるべきなのか？
 */
class インターネット接続の保証に関する法律(override val person: Person) : LawAndOrder, 最低限の文化的生活の具体的基準を決める法律 {

    val MinimumSpeedOfInternetConnection = InternetSpeed(10)


    /**
     * 最低接続速度は 10M bps である
     */
    override fun hasMinimumRight() =
        if (person.rightStatus
            .internetSpeed.bitPerSecond.toInt() >
            MinimumSpeedOfInternetConnection.bitPerSecond.toInt()
        ) {
            LawAndOrder.Legal(true)
        } else {
            LawAndOrder.Legal(false)
        }
}
