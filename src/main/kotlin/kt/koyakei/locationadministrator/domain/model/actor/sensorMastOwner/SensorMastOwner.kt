package kt.koyakei.core.domain.model.actor.sensorMastOwner

import java.time.LocalDateTime

/**
 * センサーマストの所有者
 * あとでもいいか
 */

interface SensorMastOwner {
    val name: String
    val createdAt: LocalDateTime
    val updatedAt: LocalDateTime
}