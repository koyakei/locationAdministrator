package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.kindOfContract

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.debt.債務
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.契約
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.civilLaw.契約当事者
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

/**
 * 売買をして義務がはっせいするというより、　何か勝手にしてあげて、お返ししてやろうと思う気持ちを勝手に持ち始めること自体が債務論で提起されている債権債務の発生状況ににているから、
 * 契約は事務管理から考えるのもよいだろう。
 * 屋根の瓦が飛んで雨漏りがしないようにしておきました　というしなりお
 *
 * 契約インスタンスを作った瞬間に事務管理を履行したものとする。
 */
class 事務管理契約(
    val 事務管理の履行者: PersonInLaw,
    val 事務管理をしてもらった人: PersonInLaw,
    val 事務管理に伴って発生した債務: 債務,
    val v事務管理対象: 事務管理対象,
    override val 契約者当事者List: List<契約当事者>// これ　事務管理だと最初に管理しておく人と管理の利益を受ける人に分かれる。
    , override val identifier: 契約.Identifier
) : 契約 {
    /**
     * 瓦が飛びました
     */
    @JvmInline
    value class 事務管理対象(val any: Any)

    /**
     *
     */
    override fun 契約履行判定(): 契約.契約履行済み {
        return 契約.契約履行済み(事務管理に伴って発生した債務.履行済みかどうか == 債務.履行済み判定(true)) // 債務解消済みかはんてい　
    }
}