package kt.koyakei.propertyRegister.domain.concreat.propertyItem

import kt.koyakei.propertyRegister.domain.GeneralItemFeature
import kt.koyakei.propertyRegister.domain.GeneralPropertyItemFeature
import kt.koyakei.propertyRegister.domain.Maker
import kt.koyakei.propertyRegister.domain.従属する要素の実体
import kt.koyakei.propertyTreeCategoryRegister.domain.model.unitOfThing.Ampere
import kt.koyakei.propertyTreeCategoryRegister.domain.model.unitOfThing.KiloWattPerHour

/**
 * 分類用ノードツリーのどこ以下に存在するのか？　を  out ジェネリクスで制限することが適当なのか？
 * コード的に表現することが正しいのであろうか？　分類を動的に動かせるにも変わらずこのような制限をコードでかけることが正しいのか？
 */
class Battery(
    override val identifier: GeneralItemFeature.Identifier,
    override val 従属する要素の実体List: List<従属する要素の実体>,
    override val 分類された要素v: GeneralItemFeature.分類された要素,
    override val name: String,
    override val maker: Maker,
    val 電池容量v: 電池容量,
    val 電池出力v: 電池出力,
    val connectorPinType: ConnectorPinType,
) : GeneralPropertyItemFeature {
    @JvmInline
    value class 電池容量(val ampere: Ampere)

    @JvmInline
    value class 電池出力(val kiloWattPerHour: KiloWattPerHour)

    @JvmInline
    value class ConnectorPinType(val any: Any)

}