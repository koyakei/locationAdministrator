package kt.koyakei.personRegister.domain.model

import java.awt.Image

/**
 * 名前を言って確認するとか、オフラインでの認証とのブリッジのためのクラスにする
 * 保険とかはオンラインでまとめちゃえばいい。でも結局写真とか名前はオフラインの最終手段
 * 機械が必要な生体認証の情報は考えない　外のcognitoみたいな認証システムに任せる。
 * 警察官が外でパット見て認証できる情報はここにためておく
 * 結婚は双方向の関係だけど、一方からじゃなくて相互に記録しておく
 * 相続から排除フラグが立ってるかどうかってどうするの？　どの親から
 * 養親の場合はそれぞれから相続廃除されるから親ごとに相続廃除のフラグを持てばいいか。
 */
data class Person(
    override val personInLawIdentifier: PersonIdentifier,
    val personName: PersonName,
    val familyIdentifier: FamilyIdentifier,
    val profilePhoto: ProfilePhoto,
    val marriagePartnerIdentifier: MarriagePartnerIdentifier,
    val parentsInLaw: ParentsInLaw,
    val inheritanceProhibitedParents: InheritanceProhibitedRelatives
) : PersonInLaw

class PersonIdentifier(override val id: Long) : PersonInLawIdentifier(id)

@JvmInline
value class PersonName(val name: String)

@JvmInline
value class ProfilePhoto(val photo: Image)

@JvmInline
value class MarriagePartnerIdentifier(val id: PersonIdentifier)

@JvmInline
value class ParentsInLaw(val personIdentifierList: List<PersonIdentifier>)

/**
 * 相続で自分を欠格排除した親族を登録
 */
@JvmInline
value class InheritanceProhibitedRelatives(val personIdentifierList: List<PersonIdentifier>)
