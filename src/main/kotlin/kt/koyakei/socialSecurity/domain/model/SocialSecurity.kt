package kt.koyakei.socialSecurity.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLawIdentifier

/**
 * 社会保障系　税金と一緒にしないのか？　現物給付がある。　監督官庁が違うっていうけど、賞罰一体として運用しないとだめなんじゃないか？
 * 税金の制度設計と払わない人を徴収する能力は違うだろ。国税庁は決められたルールを守らせる努力だけをする省庁にする。
 * したがってここに税金のルールも給付のルールも含める
 *
 * 入出金で分けるんじゃなくて、文化系とか健康系とかインターネットの提供とかの分野別で考える。この方向の分割条件に名前をつけたい
 * 財産目録や権利目録への登録インターフェイスとしてのサービスを作ろう
 */
data class SocialSecurity(val personInLawIdentifier: PersonInLawIdentifier) {
}