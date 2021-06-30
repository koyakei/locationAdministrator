package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.刑事的事実
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.被告人

class 交通事故の刑事的事実(
    override val identifier: 刑事的事実.Identifier,
    override val 被告人: 被告人,
    override val v内容: 交通事故の刑事的内容
) : 刑事的事実 {
    class 交通事故の刑事的内容(val 交通事故の報告: 交通事故の報告) : 刑事的事実.内容 {


    }

}