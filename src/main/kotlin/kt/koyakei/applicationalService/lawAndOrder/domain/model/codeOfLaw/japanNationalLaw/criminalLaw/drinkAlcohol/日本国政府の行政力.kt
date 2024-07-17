package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.japanNationalLaw.criminalLaw.drinkAlcohol

import kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.日本国政府の行政力

interface 日本国政府の行政力: 日本国政府の行政力 {
    fun confiscate(alcohol: Alcohol, equipment: Equipment) {
        // 没収する
    }

    fun dispose(alcohol: Alcohol, equipment: Equipment) {
        // 廃棄する
    }

    fun takeNecessaryMeasures(alcohol: Alcohol, equipment: Equipment) {
        // その他の必要な処置を行う
    }
}