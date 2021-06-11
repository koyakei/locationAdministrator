package kt.koyakei.personInLawRegister.domain.model.administrativeOrganizationCode

/**
 * https://ja.wikipedia.org/wiki/%E5%85%A8%E5%9B%BD%E5%9C%B0%E6%96%B9%E5%85%AC%E5%85%B1%E5%9B%A3%E4%BD%93%E3%82%B3%E3%83%BC%E3%83%89
 * https://www.soumu.go.jp/main_content/000632830.pdf
 *
 */
data class 全国地方公共団体Code(val identifier: Identifier,
){
    @JvmInline
    value class Identifier( val long:Long)

    data class 全国地方公共団体都道府県Code(val identifier: Identifier,
    ) {
        @JvmInline
        value class Identifier(val long: Long)
    }

    data class 全国地方公共団体市区町村Code(val identifier: Identifier,
    ) {
        @JvmInline
        value class Identifier(val long: Long)
    }

    data class 全国地方公共団政令指定都市Code(val identifier: Identifier,
    ) {
        @JvmInline
        value class Identifier(val long: Long)
    }
}
