package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote

import kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.法令の作成更新廃止.法案
import java.time.ZonedDateTime

interface 投票キャンペーン {
    val 法案: 法案
    val 投票ルール: 投票ルール
    val startedAt: ZonedDateTime
}