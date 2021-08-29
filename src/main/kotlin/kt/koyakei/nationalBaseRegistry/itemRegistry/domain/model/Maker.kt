package kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 作った法人を定義するのか
 * メーカー名を別につける？
 * とりあえずつけないでおくか
 */
data class Maker(val personInLawIdentifier: PersonInLaw.Identifier) {
}