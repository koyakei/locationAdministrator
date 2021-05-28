package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.referendum

data class 法案(val identifier: Identifier){
    @JvmInline
    value class Identifier(val long: Long)
}
