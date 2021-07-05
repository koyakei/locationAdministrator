package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.有罪無罪判定
import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.構成要件該当性判定
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class 交通事故構成要件該当性判定(
    override val 事実: 交通事故の刑事的事実,
) : 構成要件該当性判定<交通事故の刑事的事実> {

    override fun handle(): 有罪無罪判定.構成要件該当性 {

        //事故証明書の発行自体の定義をしないとだめか
        //事故を定義して、それに関わっているのかの判定はべつにまかせるか
        return 有罪無罪判定.構成要件該当性(
            事実.v内容.交通事故の報告.交通事故当事者List.any { it as PersonInLaw.Identifier == 事実.被告人.identifier as PersonInLaw.Identifier}
        )
    }
}