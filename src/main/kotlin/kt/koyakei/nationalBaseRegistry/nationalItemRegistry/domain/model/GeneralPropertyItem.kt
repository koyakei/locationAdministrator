package kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model

import kt.koyakei.naturalBaseRegistry.Item

/**
 * 複数のつりーを格納
 */
class GeneralPropertyItem(
    override val identifier: GeneralIdentifier,
    override val 従属する要素の実体List: List<従属する要素の実体>,
    override val 分類された要素v: GeneralItemFeature.分類された要素,
    override val name: String,

    val maker: Maker
) : GeneralItemFeature {
    data class GeneralIdentifier(override val long: Long): Item.Identifier
    // maker はサービスにはいらないなぁ
}