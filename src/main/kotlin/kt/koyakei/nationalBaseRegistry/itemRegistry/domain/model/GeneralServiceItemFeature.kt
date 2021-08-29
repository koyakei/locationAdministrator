package kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model.GeneralItemFeature

/**
 * サービスの提供
 */
interface GeneralServiceItemFeature: GeneralItemFeature{
    val generalItemFeatureIdentifier: Item.Identifier
}