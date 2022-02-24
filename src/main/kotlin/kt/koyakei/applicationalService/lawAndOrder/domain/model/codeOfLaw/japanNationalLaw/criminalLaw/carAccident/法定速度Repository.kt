package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident

import kt.koyakei.naturalBaseRegistry.roadTopologyMap.domain.model.Road

interface 法定速度Repository {
    fun findVelocityLimit(roadIdentifier: Road.Identifier): kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.carAccident.交通事故の報告.Velocity
}