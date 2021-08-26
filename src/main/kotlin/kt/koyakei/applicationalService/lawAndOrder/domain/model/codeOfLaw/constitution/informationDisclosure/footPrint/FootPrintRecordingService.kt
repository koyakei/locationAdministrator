package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

/**
 * 足跡記録機能
 * アスペクトとして差し込む
 * 情報取得のデモを作る
 * 情報閲覧系ファンクション
 */
@Aspect
@Component
class FootPrintRecordingService( private val footPrintDataRepository: FootPrintDataRepository) {
    @After(
        "kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション+" +
                " target(lookingUpDemandInput)" +
                " service(情報閲覧アクション)"

    )
    fun handle( footPrintData: FootPrintData,){
        footPrintDataRepository.save(footPrintData)
    }
}