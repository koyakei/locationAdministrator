package kt.koyakei.driveingRecordingSystem.domain.model

import kt.koyakei.geometricMap.domain.model.GeometricPoint

data class RecordedData(
    val geometricRange: GeometricPoint,
    val driver: Driver
){

}
