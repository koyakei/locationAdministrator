package kt.koyakei.nationalBaseRegistry.nationalItemRegistry.domain.model

import kt.koyakei.naturalBaseRegistry.Item

/**
 * サービスの提供
 */
interface GeneralServiceItemFeature: GeneralItemFeature{
    val generalItemFeatureIdentifier: Item.Identifier
}