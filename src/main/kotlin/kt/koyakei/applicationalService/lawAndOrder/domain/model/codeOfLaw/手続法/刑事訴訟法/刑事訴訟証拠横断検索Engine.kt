package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.手続法.刑事訴訟法

import kt.koyakei.applicationalService.lawAndOrder.domain.model.SearchEngine
import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint.情報閲覧アクション
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class 刑事訴訟証拠横断検索Engine: SearchEngine {
    override fun findAll(
        searchCondition: 情報閲覧アクション.SearchCondition,
        readerIdentifier: PersonInLaw.Identifier
    ): 情報閲覧アクション.見たい情報 {
        TODO("Not yet implemented")
    }
}