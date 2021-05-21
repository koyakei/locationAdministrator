package kt.koyakei.core.domain.model.areas.location

import kt.koyakei.locationadministrator.domain.model.areas.location.administrativeLocation.AddressValueObject

/**
 * 実体の予行方向の広さがある区域　縦方向の広さしか無い二次元の領域は想定しない。算出時に問題を起こしそうだから
 */
open class BusinessLocation(
    open val addressValueObject: AddressValueObject,
    val name: String,
    open val parentId: Long,
    val id: Long,
    override val enterLocationCondition: Location.EnterLocationCondition
) : Location {

    // parentIdを入れたら、自動的にparentLocationがロードされるようにしたい。
    // 　いちいちっロードするコードを他のクラスに書きたくないな
    // コンストラクタに含めないのは正しい





}