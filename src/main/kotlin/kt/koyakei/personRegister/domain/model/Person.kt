package kt.koyakei.personRegister.domain.model

import java.awt.Image

/**
 * 名前を言って確認するとか、オフラインでの認証とのブリッジのためのクラスにする
 * 保険とかはオンラインでまとめちゃえばいい。でも結局写真とか名前はオフラインの最終手段
 * 機械が必要な生体認証の情報は考えない　外のcognitoみたいな認証システムに任せる。
 * 警察官が外でパット見て認証できる情報はここにためておく
 * 結婚は双方向の関係だけど、一方からじゃなくて相互に記録しておく
 */
data class Person(override val personInLawIdentifier: PersonIdentifier,
                  val personName: PersonName,
                  val familyIdentifier: FamilyIdentifier,
                  val profilePhoto: ProfilePhoto,
                  val marriagePartnerIdentifier: MarriagePartnerIdentifier,
                  val parentsInLaw: ParentsInLaw

): PersonInLaw

class PersonIdentifier(override val  id: Long)
    : PersonInLawIdentifier(id)

@JvmInline
value class PersonName(val name:String)

@JvmInline
value class ProfilePhoto(val photo: Image)

@JvmInline
value class MarriagePartnerIdentifier(val id: PersonIdentifier)

@JvmInline
value class ParentsInLaw(val personIdentifierList: List<PersonIdentifier>)
