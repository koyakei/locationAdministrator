package kt.koyakei.privateCompany.privateLocationAdministrator.model.locationEnterable

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.LocationEnterable
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation.AddressValueObject


/**
 * 実体の予行方向の広さがある区域　縦方向の広さしか無い二次元の領域は想定しない。算出時に問題を起こしそうだから
 */
open class BusinessLocation(
    open val addressValueObject: AddressValueObject,
    val name: String,
    open val parentId: Long,
    val id: Long,
    override val enterLocationCondition: LocationEnterable.EnterLocationCondition
) : Location {

    // parentIdを入れたら、自動的にparentLocationがロードされるようにしたい。
    // 　いちいちっロードするコードを他のクラスに書きたくないな
    // コンストラクタに含めないのは正しい





}