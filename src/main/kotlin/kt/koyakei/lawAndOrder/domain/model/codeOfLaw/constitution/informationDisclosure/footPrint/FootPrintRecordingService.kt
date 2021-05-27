package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

import org.aspectj.lang.annotation.Aspect

/**
 * 足跡記録機能
 * アスペクトとして差し込む
 * 情報取得のデモを作る
 * 情報閲覧系ファンクション
 */
@Aspect
class FootPrintRecordingService( private val footPrintDataRepository: FootPrintDataRepository) {
    fun handle( footPrintData: FootPrintData){
        footPrintDataRepository.save(footPrintData)
    }
}