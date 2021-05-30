package kt.koyakei.driveingRecordingSystem.domain.service

import kt.koyakei.driveingRecordingSystem.domain.model.DrivingRecord検索条件
import kt.koyakei.driveingRecordingSystem.domain.repository.DrivingDataRepository
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import kt.koyakei.personRegister.domain.model.PersonInLaw

class DrivingRecordSearchEngine(
    val drivingDataRepository: DrivingDataRepository
    ): 情報閲覧アクション{
    /**
     * 運転記録システム検索条件は情報閲覧アクション全体の
     * 検索条件をインターフェイスで継承することはないであろう。
     */
     fun handle(reciever: PersonInLaw.Identifier,
                    drivingRecord検索条件: DrivingRecord検索条件
    ): 情報閲覧アクション.見たい情報 {
        return 情報閲覧アクション.見たい情報(
            drivingDataRepository.find(drivingRecord検索条件)
        )
    }


}