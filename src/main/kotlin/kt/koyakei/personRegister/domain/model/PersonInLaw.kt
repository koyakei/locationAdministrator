package kt.koyakei.personRegister.domain.model

interface PersonInLaw{
    val identifier: Identifier
    @JvmInline
    value class Identifier(val id : Long)
}


