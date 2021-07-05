package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有罪無罪判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有責判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.被告人

class 交通事故有責判定(
    override val 事実: 交通事故の刑事的事実,
    override val 被告人: 被告人,
    override val 判定基準List: List<有罪無罪判定.刑事的責任の有無>,
    val v法定速度Repository: 法定速度Repository,
) :有責判定<交通事故の刑事的事実>{
    override fun handle():有罪無罪判定.刑事的責任の有無 =
        有罪無罪判定.刑事的責任の有無(事実.v内容.交通事故の報告.velocity as Long <= v法定速度Repository.findVelocityLimit(事実.v内容.交通事故の報告.事故現場Identifier) as Long)

}