package kt.koyakei.driveingRecordingSystem.domain.aggregate

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.手続法.刑事訴訟法.Prosecutor

/**
 * 捜査官なのでより細かい情報が取れるようにしよう
 *
 */
interface DrivingRecordSearchConditionForProsecutor {
    val prosecutorIdentifier: Prosecutor.Identifier

}