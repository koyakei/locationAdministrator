package kt.koyakei.core.domain.service.nestedData

class ExtendedSingleData(
    val id: Int,
    val name: String,
    val quantity: Number
) {


    /**
     * 可変長引数分だけの配列を用意する。
     * 可変長引数は一旦やめ
     */
    fun getColumnList(): List<Any> {

        return listOf()
    }

    /**
     * 同一性 identifying ではなくて 等価性 equality を確かめているのでこれでいい
     */
    override fun equals(other: Any?): Boolean {
        other as ExtendedSingleData
        return id == other.id && name.equals(other.name) && quantity == other.quantity
    }

}