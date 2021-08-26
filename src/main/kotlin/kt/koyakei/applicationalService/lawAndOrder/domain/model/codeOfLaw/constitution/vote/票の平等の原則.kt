package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.personInLawRegister.domain.model.Person

/**
 * 一人一票以上の投票もありますので
 * 投票っていうのは株みたいに権利に傾斜をつけるものは対象にしないようにしよう
 * 株とかは事前の契約に沿って民意的投票を実行するみたいな位置づけにする。
 *
 */
interface 票の平等の原則 {
    val person: Person
    val 投票券: 投票券

}