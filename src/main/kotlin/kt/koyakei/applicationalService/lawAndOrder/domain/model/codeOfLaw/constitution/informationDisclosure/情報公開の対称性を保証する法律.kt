package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure

import kt.koyakei.personInLawRegister.domain.model.Person

/**
 * 公開してきた相手の情報の情報を情報の所有者が読めるアクセス権を与える
 * 情報閲覧時に必ず足跡をつける
 * テスト形式で書いていいのか？テストはメインコードじゃないしあんまり良くないなぁ
 * 足跡クラスをここから呼ぶことはないか？　下の階層のインターフェイスを上から呼んでいいのか？
 * 情報公開閲覧をするクラスだという条件　命名規則は？　
 * できればインターフェイスで読み込んどきたいんだけど、
 * リーガルチェック関数をインターフェイスから　手続き法　実体法
 */
class 情報公開の対称性を保証する法律 {

    /**
     * 情報閲覧対象を
     */

    /**　自動車事故で相手の情報を探す場合 年齢とか色々あるね
    // これは自動車運転なら自動車運転履歴の検索システムに対して横断検索をかけられるような状態にしれいればいいのかな？
    // 横断検索の場合は person id だけで行うようにして、
    // 反対にアクセスする権限を与える。　足跡機能　権限がなくても足跡さえ付けばいい
    集団で保持している情報については？　個人が特定されるほど狭い集団を条件にした検索は？
    これは個人情報保護のための知識が必要そうだ
　　　　フットプリント機能 アスペクト
     　フットプリントをもとにした逆アクセスの許可機能
     この２つに分けよう
     **/
    data class DemandedInformationCondition(
        var targetPerson: Person,
        val age: Long,
    )
}