package kt.koyakei.core.domain.model.valueObject.positioning

import kt.koyakei.locationadministrator.domain.model.areas.location.administrativeLocation.AddressValueObject

/**
 * 住所はzip と adress で保持する部分を重複させたくないよね。
 *
 */
data class AddressInfo(
    val japanPostalCode: AddressValueObject.JapanPostalCode,
    val addressValueObject: AddressValueObject
) {




}