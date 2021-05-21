package kt.koyakei.geneticRelationRegister.domain.model

import kt.koyakei.personRegister.domain.model.PersonIdentifier

/**
 * 遺伝子情報の取得の証跡は別システムで保管
 */
data class GeneticPerson(
    val personIdentifier: PersonIdentifier,
    val fatherIdentifier: FatherIdentifier,
    val motherIdentifier: MotherIdentifier,
    val geneSequence: GeneSequence
)

@JvmInline
value class FatherIdentifier(val id: PersonIdentifier)

@JvmInline
value class MotherIdentifier(val id: PersonIdentifier)

@JvmInline
value class GeneSequence(val sec: String)