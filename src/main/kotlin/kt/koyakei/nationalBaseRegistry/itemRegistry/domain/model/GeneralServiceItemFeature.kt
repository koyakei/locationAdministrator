package kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model

import kt.koyakei.naturalBaseRegistry.Item

/**
 * サービスの提供
 */
interface GeneralServiceItemFeature: GeneralItemFeature{
    val generalItemFeatureIdentifier: Item.Identifier
}