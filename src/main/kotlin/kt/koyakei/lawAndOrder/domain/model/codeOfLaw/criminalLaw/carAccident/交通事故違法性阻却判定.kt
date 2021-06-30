package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.刑事的事実
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有罪無罪判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.違法性阻却判定

class 交通事故違法性阻却判定(override val 事実: 交通事故の刑事的事実) :違法性阻却判定<交通事故の刑事的事実> {
    override fun handle(): 有罪無罪判定.違法性阻却の有無 {
        TODO("Not yet implemented")
    }
}