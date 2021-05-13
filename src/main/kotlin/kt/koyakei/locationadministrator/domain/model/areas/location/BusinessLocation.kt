package kt.koyakei.core.domain.model.areas.location

import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject
import java.net.URL

/**
 * 実体の予行方向の広さがある区域　縦方向の広さしか無い二次元の領域は想定しない。算出時に問題を起こしそうだから
 */
open class BusinessLocation(
    open val addressValueObject: AddressValueObject,
    override val enterLocationCondition: Location.EnterLocationCondition,
    override val areaIdentifier: BusinessLocationIdentifier,
    override val name: String,
    open val parentId: Long,
    override val id: Long
) : Location<BusinessLocation.BusinessLocationIdentifier> {

    // parentIdを入れたら、自動的にparentLocationがロードされるようにしたい。
    // 　いちいちっロードするコードを他のクラスに書きたくないな
    // コンストラクタに含めないのは正しい

    override fun areaURIGenerator(name: String): URL {
        return URL(name)
    }

    data class BusinessLocationIdentifier(
        override val uri: String,
        var id: Long
    ) : Location.LocationIdentifier



}