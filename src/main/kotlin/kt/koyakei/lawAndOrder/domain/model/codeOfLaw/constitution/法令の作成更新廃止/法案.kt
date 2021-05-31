package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止

data class 法案(val identifier: Identifier){
    @JvmInline
    value class Identifier(val long: Long)
}
