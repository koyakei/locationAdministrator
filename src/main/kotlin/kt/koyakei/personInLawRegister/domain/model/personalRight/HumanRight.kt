package kt.koyakei.personInLawRegister.domain.model.personalRight

import kt.koyakei.personInLawRegister.domain.model.Person

/**
 * 基本的人権
 * 誰の
 * どんな権利
 *
 * 基本的じゃない人権ってあるのか？？
 * 各サービスのデータリポジトリからおおよそ最新の情報を検索のために取得してくるのならありだろう
 */
interface HumanRight{
    val person: Person

}

