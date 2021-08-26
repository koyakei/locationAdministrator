package kt.koyakei.applicationalService.driveingRecordingSystem.domain.repository

import kt.koyakei.applicationalService.driveingRecordingSystem.domain.model.DrivingRecord検索条件
import kt.koyakei.applicationalService.driveingRecordingSystem.domain.model.RecordedData

interface DrivingDataRepository {
    fun find(drivingRecord検索条件: DrivingRecord検索条件):List<
            RecordedData>
}