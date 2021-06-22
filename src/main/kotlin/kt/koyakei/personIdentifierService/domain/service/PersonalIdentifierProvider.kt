package kt.koyakei.personIdentifierService.domain.service

import kt.koyakei.personIdentifierService.domain.model.PersonalIdentificationEvidence
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 人物特定情報を引き出すサービス
 * 使うときには使用目的と使用者を登録して人物特定情報を入力する　その人間が本人か返す
 * 人物特定情報を投げるとだれかわかる　確率で複数人の候補をあげる
 * 　この２つができるサービス
 *
 */
interface PersonalIdentifierProvider<E : Any> {
    @JvmInline
    value class 本人です(val boolean: Boolean)
    /**
     * 証明書
     * 自分は誰だと思うか？
     */
    fun handle(
        personalIdentificationEvidence: PersonalIdentificationEvidence<E>,
        personInLawIdentifier: PersonInLaw.Identifier
    ) : 本人です

    @JvmInline
    value class 一致してます(val boolean: Boolean)
}