package kt.koyakei.privateCompany.postalCodeRegister.model

import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.City
import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.Prefecture
import kt.koyakei.legacyService.地方自治法LocationRegister.domain.model.areas.location.administrativeLocation.町字
import kt.koyakei.naturalBaseRegistry.Item

/**
 * 日本郵政株式会社が管理する
 */
class JapanPostalCode(
    private val body: String// 7digit
                      ,
                      override val createdAt: CreatedAt,
                      override val vailedAt: VailedAt,
                      override val identifier: Identifier,
                      override val parentItemIdentifier: Item.Identifier,
                      override val name: Item.ItemName
) : Item{
    @JvmInline
    value class Identifier(override val long: Long): Item.Identifier
    /**
     *
     * AddressValueObject にしたい
     * 郵便番号を振り直して nullable にならないようにする。
     */
        fun getAddressFromPostalCode(): PostalCodeAddressObject {
            return PostalCodeAddressObject(
                prefecture = Prefecture.神奈川県,
                city = City.三浦郡葉山町,
                aza = 町字.長柄
            )
        }
    // ハイフン付き七桁
    fun getCodeWithHyphen(): String {
        return body
    }

    data class PostalCodeAddressObject(
        val prefecture: Prefecture,
        val city: City,
        val aza: 町字
    )
}

