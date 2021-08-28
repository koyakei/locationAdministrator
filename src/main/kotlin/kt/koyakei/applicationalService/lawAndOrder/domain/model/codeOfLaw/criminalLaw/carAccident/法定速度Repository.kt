package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.Road

interface 法定速度Repository {
    fun findVelocityLimit(roadIdentifier: Road.Identifier): 交通事故の報告.Velocity
}