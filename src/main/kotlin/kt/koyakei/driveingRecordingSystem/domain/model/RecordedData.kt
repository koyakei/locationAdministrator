package kt.koyakei.driveingRecordingSystem.domain.model

import kt.koyakei.geometricMap.domain.model.GeometricPoint
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション

data class RecordedData(
    override val identifier: 情報閲覧アクション.Information.Identifier,
    val geometricRange: GeometricPoint,
    val driver: Driver
): 情報閲覧アクション.Information {

}
