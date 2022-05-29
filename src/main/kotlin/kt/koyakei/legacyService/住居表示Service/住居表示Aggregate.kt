package kt.koyakei.legacyService.住居表示Service

import org.axonframework.eventhandling.AllowReplay
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
@AllowReplay
class 住居表示Aggregate() {
    @AggregateIdentifier
    private lateinit var id: String

    /**
     * 住居表示から　LocationId
     */
//    fun search住居表示(): Location.Identifier{
//    }
}