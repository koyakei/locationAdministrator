package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.有罪無罪判定
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.違法性阻却判定


interface 交通事故違法性阻却判定: 違法性阻却判定<交通事故の刑事的事実> {
    override val 事実: 交通事故の刑事的事実
    override fun handle(): 有罪無罪判定.違法性阻却の有無

}