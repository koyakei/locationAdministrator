package kt.koyakei.core.domain.model.actor.sensorMastOwner.sensorUnitOwner

/**
 * 一つのユニット内に複数の仮想的なセンサーを設定可能
 * 通常スイッチスマイルだが、他社が設置することもある。
 */
class SensorUnitOwner(
        val name: String,
        val id: Long
)