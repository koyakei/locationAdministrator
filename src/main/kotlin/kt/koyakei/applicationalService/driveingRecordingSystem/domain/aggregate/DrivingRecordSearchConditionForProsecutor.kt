package kt.koyakei.applicationalService.driveingRecordingSystem.domain.aggregate

import kt.koyakei.applicationalService.driveingRecordingSystem.domain.model.Car
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.手続法.刑事訴訟法.Prosecutor

/**
 * 捜査官なのでより細かい情報が取れるようにしよう
 *
 */
interface DrivingRecordSearchConditionForProsecutor {
    val prosecutorIdentifier: Prosecutor.Identifier
    val carIdentifier: Car.Identifier
}