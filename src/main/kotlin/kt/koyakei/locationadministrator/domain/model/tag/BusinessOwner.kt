package kt.koyakei.core.domain.model.tag

class BusinessOwner(val businessOwnerIdentifier: BusinessOwnerIdentifier) {
    class BusinessOwnerIdentifier(val japanCorporateNumber: String, // 法人番号
                                  val corporateName: String,
                                  val DUNS: String
                                   )
}