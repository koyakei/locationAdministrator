package kt.koyakei.core.domain.model.valueObject.positioning

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation.AddressValueObject
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation.JapanPostalCode

/**
 * 住所はzip と adress で保持する部分を重複させたくないよね。
 *
 */
data class AddressInfo(
    val japanPostalCode: JapanPostalCode,
    val addressValueObject: AddressValueObject
) {




}