package kt.koyakei.applicationalService.driveingRecordingSystem.domain.model

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

data class Driver(
    val identifier: Identifier,
    val personIdentifier: PersonInLaw.Identifier
                  ){
    @JvmInline
    value class Identifier(val id: Long)
}
