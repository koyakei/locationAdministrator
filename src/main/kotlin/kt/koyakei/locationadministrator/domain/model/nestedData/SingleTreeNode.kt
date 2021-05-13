package kt.koyakei.core.domain.model.nestedData

/**
 * リスト同士の可変長引数の数が合っているかどうかが保証できないからそれをどう保証するか？
 * 可変長でやると難しいから固定長２つからやろうか
 * バリューオブジェクトじゃないかという疑い
 */
class SingleTreeNode(val id: Int, val name: String?, val quantity: Number?) {

}