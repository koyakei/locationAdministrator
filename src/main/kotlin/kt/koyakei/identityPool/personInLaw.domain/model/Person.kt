package kt.koyakei.personInLawRegister.domain.model

import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import kt.koyakei.legacyService.戸籍Service.model.domain.person.RightStatus

/**
 * 名前を言って確認するとか、オフラインでの認証とのブリッジのためのクラスにする
 * 保険とかはオンラインでまとめちゃえばいい。でも結局写真とか名前はオフラインの最終手段
 * 機械が必要な生体認証の情報は考えない　外のcognitoみたいな認証システムに任せる。
 * 警察官が外でパット見て認証できる情報はここにためておく
 * 結婚は双方向の関係だけど、一方からじゃなくて相互に記録しておく
 * 相続から排除フラグが立ってるかどうかってどうするの？　どの親から
 * 養親の場合はそれぞれから相続廃除されるから親ごとに相続廃除のフラグを持てばいいか。
 * ここの要素がめちゃくちゃ増えるのはやばい。　家族関係とか生活実態とかクラスで分けていくべき
 * データが欠落しているときにも登録できるようにするが、 null を許容しない仕組みをどう作っていくか？
 *
 * 客観的なステータスのみを記載するようにしよう。
 *
 * 誕生前から管理する　出生前診断の結果なども蓄積する必要があることから、
 * 戸籍ではなく政府のシステムとして個体の識別が必要な時期から登録する
 * 人間管理システムと戸籍管理システムは別なのでは？
 * ここから横断検索するときに、マイクロサービス間でものすごい通信が発生するから遅くならないか？
 * 横断検索専用サービスを立ち上げてそこのドキュメント型DBから検索結果を取得するようにしたほうがいいのでは？
 *
 */
data class Person(
    override val identifier: PersonInLaw.Identifier,
    override val registeredAt: PersonInLaw.RegisteredAt,
    val rightStatus: RightStatus,
    override val itemIdentifier: Item.Identifier,
    val age: Number
) : PersonInLaw {



}



