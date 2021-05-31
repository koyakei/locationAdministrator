package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.vote

interface 投票ルール {
    val 投票主体: 投票主体
    val 投票権の分配: 投票権の分配
    val 可決条件: 可決条件
}