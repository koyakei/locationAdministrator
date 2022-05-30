package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.有罪無罪判定
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.構成要件該当性判定

class 交通事故構成要件該当性判定(
    override val 事実: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident.交通事故の刑事的事実,
) : 構成要件該当性判定<交通事故の刑事的事実> {

    override fun handle(): 有罪無罪判定.構成要件該当性 {

        //事故証明書の発行自体の定義をしないとだめか
        //事故を定義して、それに関わっているのかの判定はべつにまかせるか
        return 有罪無罪判定.構成要件該当性(
            事実.v内容.交通事故の報告.交通事故当事者List.any { it.personInLawIdentifier == 事実.被告人.identifier }
        )
    }
}