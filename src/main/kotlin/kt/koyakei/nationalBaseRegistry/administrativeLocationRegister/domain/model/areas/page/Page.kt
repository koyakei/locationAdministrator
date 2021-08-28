package kt.koyakei.core.domain.model.areas.page


import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.domain.model.areas.Area


interface Page : Area<Area.AreaIdentifier> {
    override val areaIdentifier: Area.AreaIdentifier
}