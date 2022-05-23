package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.location

import kt.koyakei.naturalBaseRegistry.area.Area

interface Location : Area{
    override val identifier: Identifier
    interface Identifier: Area.Identifier

}