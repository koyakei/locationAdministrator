package kt.koyakei.applicationalService.personIdentifierService.domain.service

import kt.koyakei.applicationalService.personIdentifierService.domain.model.PersonalIdentificationEvidence
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
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
     * デコードされたパスワードをここで渡したくない。
     * openIDで認証している仕組みってなんなのか？
     * UserIdからメールアドレスを引いてそれでOPENIDにそのアドレスが登録しているか見る
     */
    fun handle(
        personalIdentificationEvidence: PersonalIdentificationEvidence<E>,
        itemIdentifier: Item.Identifier
    ) : 本人です

    @JvmInline
    value class 一致してます(val boolean: Boolean)
}