package kt.koyakei.applicationalService.driveingRecordingSystem.domain.model

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション

data class RecordedData(
    override val identifier: 情報閲覧アクション.Information.Identifier,
    val geometricRange: kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricPoint,
    val driver: Driver
): 情報閲覧アクション.Information {

}
