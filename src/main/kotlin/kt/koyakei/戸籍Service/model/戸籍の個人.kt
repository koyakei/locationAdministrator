package kt.koyakei.戸籍Service.model

import kt.koyakei.personInLawRegister.domain.model.Person
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw
import kt.koyakei.戸籍Service.model.domain.Family
import kt.koyakei.戸籍Service.model.domain.person.RightStatus
import java.time.ZonedDateTime

data class 戸籍の個人(val identifier: Identifier,
                 val personInLawIdentifier: PersonInLaw.Identifier,
                 val marriagePartnerIdentifier: MarriagePartnerIdentifier,
                 val parentsInLaw: ParentsInLaw,
                 val inheritanceProhibitedParents: InheritanceProhibitedRelatives,
                 val rightStatus: RightStatus,

                 val personName: PersonName,
                 val familyIdentifier: Family.FamilyIdentifier,
){
    @JvmInline
    value class BirthDateTimeAt(val zonedDateTime: ZonedDateTime)

    @JvmInline
    value class PersonName(val name: String)

    @JvmInline
    value class Identifier(val id: Long)

    @JvmInline
    value class MarriagePartnerIdentifier(val id: PersonInLaw.Identifier)

    @JvmInline
    value class ParentsInLaw(val identifierList: List<PersonInLaw.Identifier>)

    /**
     * 相続で自分を欠格排除した親族を登録
     */
    @JvmInline
    value class InheritanceProhibitedRelatives(val identifierList: List<PersonInLaw.Identifier>)

}
