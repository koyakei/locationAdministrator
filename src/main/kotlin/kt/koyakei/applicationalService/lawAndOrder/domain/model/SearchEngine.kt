package kt.koyakei.applicationalService.lawAndOrder.domain.model

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface SearchEngine {
    fun findAll(searchCondition: 情報閲覧アクション.SearchCondition,
                readerIdentifier: PersonInLaw.Identifier
    ) : 情報閲覧アクション.見たい情報
}