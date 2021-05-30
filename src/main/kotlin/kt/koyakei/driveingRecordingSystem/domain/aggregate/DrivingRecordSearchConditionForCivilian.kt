package kt.koyakei.driveingRecordingSystem.domain.aggregate

import kt.koyakei.personRegister.domain.model.PersonInLaw

/**
 * 全員が使える検索システム
 * 個人が特定できないなら、閲覧者の個人も特定できない対称性がほしい。
 * 見る対象が都道府県とか
 * 捜査だと
 */
data class DrivingRecordSearchConditionForCivilian(
    val personInLawIdentifier: PersonInLaw.Identifier
) {
}