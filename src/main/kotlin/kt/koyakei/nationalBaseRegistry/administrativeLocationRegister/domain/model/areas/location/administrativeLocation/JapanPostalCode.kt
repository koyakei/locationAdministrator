package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

class JapanPostalCode(private val body: String// 7digit
) {

    /**
     *
     * AddressValueObject にしたい
     * 郵便番号を振り直して nullable にならないようにする。
     */
        fun getAddressFromPostalCode(): PostalCodeAddressObject {
            return PostalCodeAddressObject(
                prefecture = Prefecture.神奈川県,
                city = City.三浦郡葉山町,
                aza = 字.長柄
            )
        }
    // ハイフン付き七桁
    fun getCodeWithHyphen(): String {
        return body
    }

    data class PostalCodeAddressObject(
        val prefecture: Prefecture,
        val city: City,
        val aza: 字
    )
}

