package kt.koyakei.applicationalService.driveingRecordingSystem.domain.model

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import java.time.ZonedDateTime

class DrivingRecord検索条件(
    val driverIdentifierList: List<Driver.Identifier>,
    val drivingAtRange: TimeRange,
    val informationIdentifierList: List<情報閲覧アクション.Information.Identifier>,
): 情報閲覧アクション.SearchCondition {

    data class TimeRange(val startedAt: ZonedDateTime, val endAt: ZonedDateTime)

}