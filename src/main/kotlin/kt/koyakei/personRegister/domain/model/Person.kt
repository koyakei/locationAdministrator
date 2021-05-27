package kt.koyakei.personRegister.domain.model

import kt.koyakei.personRegister.domain.model.person.RightStatus
import java.awt.Image

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
 */
data class Person(
    override val identifier: PersonInLaw.Identifier,
    val personName: PersonName,
    val familyIdentifier: Family.FamilyIdentifier,
    val profilePhoto: ProfilePhoto,
    val marriagePartnerIdentifier: MarriagePartnerIdentifier,
    val parentsInLaw: ParentsInLaw,
    val inheritanceProhibitedParents: InheritanceProhibitedRelatives,
    val rightStatus: RightStatus
) : PersonInLaw {

    @JvmInline
    value class PersonName(val name: String)

    @JvmInline
    value class ProfilePhoto(val photo: Image)

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



