package kt.koyakei.applicationalService.commercialItemMasterDatabase.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.GeneralItemFeature

/**
 * サービスの提供
 */
interface GeneralServiceItemFeature{
    val generalItemFeatureIdentifier: GeneralItemFeature.Identifier
}