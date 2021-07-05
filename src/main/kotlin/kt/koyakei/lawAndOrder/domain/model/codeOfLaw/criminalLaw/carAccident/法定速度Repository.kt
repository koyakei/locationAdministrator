package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.criminalLaw.carAccident

import kt.koyakei.roadTopologyMap.domain.model.Road

interface 法定速度Repository {
    fun findVelocityLimit(roadIdentifier: Road.Identifier): 交通事故の報告.Velocity
}