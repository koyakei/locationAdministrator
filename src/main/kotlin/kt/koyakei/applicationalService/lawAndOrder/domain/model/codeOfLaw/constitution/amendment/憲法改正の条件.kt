package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.amendment

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.referendum.国民投票Service

class 憲法改正の条件(){
     val 国民投票 = 国民投票Service()
//     val 国会の議決 国会の議決が遠あったあとに　国民投票をする
// 式で決議の流れを作っておいてそれを高階関数として渡して使ってもらう
     // 途中で否決されたら否決を返す　可決なら可決を返す

}
