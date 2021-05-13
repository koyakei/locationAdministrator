package kt.koyakei.locationadministrator.aggregate

import kt.koyakei.core.domain.model.valueObject.positioning.AddressValueObject

data class AddressAggregate(val prefecture: AddressValueObject.Prefecture)
