package kt.koyakei.privateCompany.privateLocationAdministrator.model.locationEnterable

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.地方自治法AddressValueObject
import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.naturalBaseRegistry.Item
import java.net.URL


/**
 * 実体の予行方向の広さがある区域　縦方向の広さしか無い二次元の領域は想定しない。算出時に問題を起こしそうだから
 */
open class BusinessLocation(
    open val addressValueObject: 地方自治法AddressValueObject,

    open val parentId: Long,
    val id: Long,
    override val identifier: Location.Identifier,
    override val createdAt: CreatedAt,
    override val vailedAt: VailedAt,
    override val parentItemIdentifier: Item.Identifier,
    override val name: Item.ItemName,
) : Location {

    // parentIdを入れたら、自動的にparentLocationがロードされるようにしたい。
    // 　いちいちっロードするコードを他のクラスに書きたくないな
    // コンストラクタに含めないのは正しい
    override fun areaURIGenerator(name: String): URL {
        TODO("Not yet implemented")
    }


}