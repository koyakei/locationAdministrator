package kt.koyakei.core.domain.model.valueObject.positioning

import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.地方自治法AddressValueObject
import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode


/**
 * 住所はzip と adress で保持する部分を重複させたくないよね。
 *
 */
data class AddressInfo(
    val japanPostalCode: JapanPostalCode,
    val addressValueObject: 地方自治法AddressValueObject
) {




}