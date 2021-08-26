package kt.koyakei.baseRegistory.roadTopologyMap.domain.model

/**
 * 所有情報は別に出す
 */
data class 行政管理道(
    override val identifier: Road.Identifier,
    override val name: Road.Name,
    override val startedFrom: Road.StartedFrom,
    override val endTo: Road.EndTo
): Road {
    @JvmInline
    value class Identifier(val long: Long)
}
