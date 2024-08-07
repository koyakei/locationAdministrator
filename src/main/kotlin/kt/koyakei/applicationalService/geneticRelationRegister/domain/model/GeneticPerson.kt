package kt.koyakei.applicationalService.geneticRelationRegister.domain.model

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

/**
 * 遺伝子情報による血縁関係を取得
 * 遺伝子情報の取得の証跡は別システムで保管
 */
data class GeneticPerson(
    val personIdentifier: PersonInLaw.Identifier,
    val fatherIdentifier: FatherIdentifier,
    val motherIdentifier: MotherIdentifier,
    val geneSequence: GeneSequence
){
    @JvmInline
    value class FatherIdentifier(val id: PersonInLaw.Identifier)

    @JvmInline
    value class MotherIdentifier(val id: PersonInLaw.Identifier)

    @JvmInline
    value class GeneSequence(val sec: String)
}

