package kt.koyakei.core.domain.model.valueObject.positioning

data class AddressValueObject(
    val prefecture: Prefecture,
    val city: City,
    val streetNumber: StreetNumber,
    val houseNumber: HouseNumber
) {

    /**
     * 住所から　アドレスを取得
     * これ郵便番号のclassに置かなくてもいいのかな？　返り値の型に置いとけばいいか？　でもそしたら self が使えんぞ
     */
    enum class Prefecture {
        神奈川県
    }

    enum class City{
        三浦郡葉山町長柄,
        逗子
    }

    class StreetNumber {

    }
    class HouseNumber


    class PairOfPostalCode{
    }
    class JapanPostalCode(private val body: String// 7digit
    ) {
        private val postalCodeList: HashMap<JapanPostalCode, AddressValueObject>
            get() {
                return hashMapOf<JapanPostalCode, AddressValueObject>(
                        JapanPostalCode("2400113") to
                                AddressValueObject(prefecture = Prefecture.神奈川県,
                                        city = City.三浦郡葉山町長柄,
                                        streetNumber = StreetNumber(),
                                        houseNumber = HouseNumber()
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
    }
}