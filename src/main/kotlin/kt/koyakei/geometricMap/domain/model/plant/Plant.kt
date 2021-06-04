package kt.koyakei.geometricMap.domain.model.plant

import kt.koyakei.geometricMap.domain.model.GeometricRange


class Plant(
    /**
     * 公園にうわっている街路樹１番みたいに管理する。　地点まで指定しなくても、なんとなく管理するため
     */
    val geometricRangeIdentifier: GeometricRange.Identifier,
) {
}