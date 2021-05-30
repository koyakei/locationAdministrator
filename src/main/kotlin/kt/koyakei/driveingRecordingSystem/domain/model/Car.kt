package kt.koyakei.driveingRecordingSystem.domain.model

data class Car(
    val identifier: Identifier,
    val carModelIdentifier: Identifier
){
    @JvmInline
    value class Identifier( val id: Long)


}
