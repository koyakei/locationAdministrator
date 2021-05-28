package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

import kt.koyakei.personRegister.domain.model.PersonInLaw

interface 情報閲覧アクション {

    // 情報識別子から
    // 見たい情報を特定してそれを返す
    fun handle(
        reciever: PersonInLaw.Identifier,
        searchCondition: SearchCondition
               ): 見たい情報

    @JvmInline
    value class 見たい情報( val vv: Any)

    interface SearchCondition {
        val informationIdentifier: Any
    }
}