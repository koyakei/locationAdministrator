package kt.koyakei.driveingRecordingSystem.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class Driver(
    val identifier: Identifier,
    val personIdentifier: PersonInLaw.Identifier
                  ){
    @JvmInline
    value class Identifier(val id: Long)
}
