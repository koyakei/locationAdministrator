package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.judicialSystem.裁判に関わる人間



interface 判決に関与する人間 {
    @JvmInline
    value class Identifier(val id :Long)
    val identifier: Identifier
}