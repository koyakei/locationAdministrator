package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.刑事的事実
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.被告人


/**
 * 交通事故は意図的に起こすことができ、殺人の手段としても使われるが、原因において自由な行為は意図的でないとして扱うことにする。
 * 計画的な謀殺でない限りはここですべて処理する。
 */
class 交通事故の刑事的事実(
    override val identifier: 刑事的事実.Identifier,
    override val 被告人: 被告人,
    override val v内容: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident.交通事故の刑事的事実.交通事故の刑事的内容
) : 刑事的事実 {
    class 交通事故の刑事的内容(val 交通事故の報告: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident.交通事故の報告) : 刑事的事実.内容 {


    }

}