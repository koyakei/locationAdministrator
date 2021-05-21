package kt.koyakei.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

class JapanPostalCode(private val body: String// 7digit
) {
    private val postalCodeList: HashMap<JapanPostalCode, PostalCodeAddressObject>
        get() {
            return hashMapOf<JapanPostalCode, PostalCodeAddressObject>(
                JapanPostalCode("2400113") to
                        PostalCodeAddressObject(
                            prefecture = Prefecture.神奈川県,
                            city = City.三浦郡葉山町,
                            aza = 字.長柄
                        )
            )
        }

    /**
     * TODO:なんで AddressValueObject? になっちゃうの？
     * AddressValueObject にしたい
     */
//        fun getAddressFromPostalCode(): AddressValueObject? {
//            return postalCodeList.get(this.body)
//        }
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

