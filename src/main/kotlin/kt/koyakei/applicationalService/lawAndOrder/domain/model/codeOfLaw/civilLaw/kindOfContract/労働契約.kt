package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.kindOfContract

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.debt.金銭支払義務
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.契約
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.契約当事者
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

interface 労働契約 : 契約 {

    override val identifier: 契約.Identifier
    override val 契約者当事者List: List<契約当事者>
    val 雇用主: PersonInLaw
    val 労働者: PersonInLaw
    val 給与: 金銭支払義務

    /**
     * 給料払ってます
     * 労働基準法守ってます
     *　残業させすぎてません
     */
    override fun 契約履行判定(): 契約.契約履行済み
}