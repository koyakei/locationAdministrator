package kt.koyakei.applicationalService.immobileRegister.domain.model

import kt.koyakei.core.domain.model.areas.location.Location
import kt.koyakei.identityPool.CreatedAt
import kt.koyakei.identityPool.VailedAt
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.Area
import kt.koyakei.naturalBaseRegistry.geometricMap.domain.model.GeometricRange
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 複数の住所を持つ土地がある。　玄関の位置を住所にするのが普通なのだが、適当な場合がある。
 * 不動産は抵当に入れられるから家と土地が不動産になった。動産との境界はなくなるので、不動産という概念は改名市分割される
 */
//interface Immobile: Item {
//    val identifierList: List<Location.Identifier>
//    val ownerIdentifier: PersonInLaw.Identifier
//}

