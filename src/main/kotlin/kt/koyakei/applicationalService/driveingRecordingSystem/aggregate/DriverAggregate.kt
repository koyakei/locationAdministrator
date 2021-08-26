package kt.koyakei.applicationalService.driveingRecordingSystem.aggregate

import kt.koyakei.applicationalService.driveingRecordingSystem.domain.model.Driver
import kt.koyakei.applicationalService.driveingRecordingSystem.domain.model.RecordedData
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
class DriverAggregate(val identifier: Identifier) {
    lateinit var driver: Driver
    lateinit var recordedData: RecordedData
    @JvmInline
    value class Identifier(val id: Long)
}