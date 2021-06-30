package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有罪無罪判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有責判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.被告人

class 交通事故有責判定(
    override val 事実: 交通事故の刑事的事実,
    override val 被告人: 被告人,
    override val 判定基準List: List<有罪無罪判定.刑事的責任の有無>,
    override val 刑事責任年齢: 被告人.Age
) :有責判定<交通事故の刑事的事実>{
    override fun 刑事責任年齢判定(): 有罪無罪判定.刑事的責任の有無 {
        TODO("Not yet implemented")
    }
}