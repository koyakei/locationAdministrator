package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.civilLaw

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 債権債務関係だけではない契約の状態があるのじゃないか？　事務管理として
 * 契約の発生主体が法人ではない可能性がある。
 */
interface 契約 {
    val 契約者List: List<PersonInLaw>

}