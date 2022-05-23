package kt.koyakei.applicationalService.domain.concreat.propertyItem

import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model.GeneralItemFeature
import kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model.GeneralPropertyItemFeature
import kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model.Maker
import kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model.従属する要素の実体
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.unitOfThing.Ampere
import kt.koyakei.internationalBaseRegistry.itemTreeCategoryRegister.domain.model.unitOfThing.KiloWattPerHour

/**
 * 分類用ノードツリーのどこ以下に存在するのか？　を  out ジェネリクスで制限することが適当なのか？
 * コード的に表現することが正しいのであろうか？　分類を動的に動かせるにも変わらずこのような制限をコードでかけることが正しいのか？
 */
class Battery(
    val identifier: Item.Identifier,
    val 従属する要素の実体List: List<従属する要素の実体>,
    val 分類された要素v: GeneralItemFeature.分類された要素,
    val name: String,
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