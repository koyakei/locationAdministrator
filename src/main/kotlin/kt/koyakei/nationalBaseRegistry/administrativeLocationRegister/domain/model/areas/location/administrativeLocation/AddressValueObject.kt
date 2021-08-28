package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location.administrativeLocation

data class AddressValueObject(
    val prefecture: Prefecture,
    val city: City,
    val streetNumber: StreetNumber,
    val aza: 字
)