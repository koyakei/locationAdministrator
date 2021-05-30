package kt.koyakei.driveingRecordingSystem.domain.model

import kt.koyakei.personRegister.domain.model.PersonInLaw

data class Driver(
    val identifier: Identifier,
    val personIdentifier: PersonInLaw.Identifier
                  ){
    @JvmInline
    value class Identifier(val id: Long)
}
