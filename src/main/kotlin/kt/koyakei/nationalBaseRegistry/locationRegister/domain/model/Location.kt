package kt.koyakei.nationalBaseRegistry.locationRegister.domain.model

import kt.koyakei.naturalBaseRegistry.area.Area

interface Location : Area{
    override val identifier: Identifier
    interface Identifier: Area.Identifier

}