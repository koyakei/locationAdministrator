package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.kindOfContract

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.金銭支払義務
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約当事者
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

interface 労働契約 : kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約 {

    override val identifier: kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約.Identifier
    override val 契約者当事者List: List<kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約当事者>
    val 雇用主: PersonInLaw
    val 労働者: PersonInLaw
    val 給与: _root_ide_package_.kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.debt.金銭支払義務

    /**
     * 給料払ってます
     * 労働基準法守ってます
     *　残業させすぎてません
     */
    override fun 契約履行判定(): kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.civilLaw.契約.契約履行済み
}