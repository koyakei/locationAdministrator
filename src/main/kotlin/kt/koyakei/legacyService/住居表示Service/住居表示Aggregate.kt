package kt.koyakei.legacyService.住居表示Service

import kt.koyakei.legacyService.住居表示Service.DataStore.住居表示Repository
import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location
import org.axonframework.eventhandling.AllowReplay
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
@AllowReplay
class 住居表示Aggregate(private val 住居表示Repository: 住居表示Repository) {
    @AggregateIdentifier
    private lateinit var id: String

    /**
     * 住居表示から　LocationId
     */
    fun search住居表示(): Location.Identifier{
        return 住居表示Repository.findBtName().identifier
    }

}