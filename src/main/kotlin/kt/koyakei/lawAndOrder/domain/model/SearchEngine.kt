package kt.koyakei.lawAndOrder.domain.model

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import kt.koyakei.personRegister.domain.model.PersonInLaw

interface SearchEngine {
    fun findAll(searchCondition: 情報閲覧アクション.SearchCondition,
                readerIdentifier: PersonInLaw.Identifier
    ) : 情報閲覧アクション.見たい情報
}