package kt.koyakei.administrativeLocationRegister.aggregate

import kt.koyakei.locationadministrator.domain.model.areas.location.administrativeLocation.AddressValueObject

data class AddressAggregate(val prefecture: AddressValueObject.Prefecture)
