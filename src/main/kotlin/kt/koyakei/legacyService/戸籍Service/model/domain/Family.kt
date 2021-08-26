package kt.koyakei.legacyService.戸籍Service.model.domain

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 家族が何人いるかとか家族関係で行政からもらえるお金は変わってくる
 * 誰と結婚しているか、結婚していたか？など、必要な情報ですね。
 *
 */
data class Family(val personIdentifierList: List<PersonInLaw.Identifier>,
                  val familyIdentifier: FamilyIdentifier
){
    @JvmInline
    value class FamilyIdentifier(val id : Long)
}


