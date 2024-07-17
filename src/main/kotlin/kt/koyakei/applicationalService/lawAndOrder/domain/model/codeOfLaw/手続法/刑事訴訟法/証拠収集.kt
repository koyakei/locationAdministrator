package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.手続法.刑事訴訟法

import kt.koyakei.applicationalService.lawAndOrder.domain.model.SearchEngine
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

/**
 * 司法検察職員は証拠収集のために検索した条件及び
 */
class 証拠収集(private val searchEngine: SearchEngine): 情報閲覧アクション {
    /**
     * この関数は　横断検索画面から使う場合に呼ぶ
     * 運転情報保管システムから証拠を集める場合どうするんだ？
     * 司法検察職員が運転情報保管システムへログインする
     * そこで検索する
     * ログインした場合、ログイン先のシステムから情報の閲覧権限を確認される場合がある。
     * 司法検察職員かどうかを司法検察職員管理システムに問い合わせてOpenIDシステムが返答するのか？
     * それとも司法検察職員管理システムが資格管理システムに対して
     * 資格があるかどうか確認するメッセージをブロードキャスト直接返事をするのか？
     * 各システムで情報閲覧アクションを行うわけだが、このクラスを必ず呼び出す必要があるのか？
     * 各システム内で情報閲覧したというメッセージをブロードキャストする規約にしておいて、それで
     */
    fun handle(
        readerIdentifier: PersonInLaw.Identifier,
        searchCondition: 情報閲覧アクション.SearchCondition
    ): 情報閲覧アクション.見たい情報{
        return searchEngine.findAll(searchCondition,readerIdentifier)
    }
}