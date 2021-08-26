package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

interface 情報閲覧アクション {

    // 情報識別子から
    // 見たい情報を特定してそれを返す
    /**
     * この関数を実行したときに　アスペクトで足跡記録サービスを実行
     */
//    fun handle(
//        reciever: PersonInLaw.Identifier,
//        searchCondition: SearchCondition
//    ): 見たい情報

    @JvmInline
    value class 見たい情報(val vv: Any)

    interface SearchCondition

    interface Information {
        val identifier: Identifier

        interface Identifier
    }
}