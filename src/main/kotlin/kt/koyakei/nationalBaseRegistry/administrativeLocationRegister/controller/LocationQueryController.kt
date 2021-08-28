package kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.controller

import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.aggregate.AdministrativeLocationAggregate
import kt.koyakei.nationalBaseRegistry.administrativeLocationRegister.query.LocationQuery
import org.axonframework.messaging.responsetypes.ResponseTypes
import org.axonframework.queryhandling.*
import org.springframework.web.bind.annotation.*

@RestController
class LocationQueryController(
    private val queryBus: QueryBus
) {

    @GetMapping("/read/{id}")
    @ResponseBody
    fun getLocation(
        @PathVariable("id") id: String
    ) : String{
        val res: AdministrativeLocationAggregate = queryBus.subscriptionQuery(
            GenericSubscriptionQueryMessage(
                LocationQuery(id),
                ResponseTypes.instanceOf(AdministrativeLocationAggregate::class.java),
                ResponseTypes.instanceOf(AdministrativeLocationAggregate::class.java)
            )
        ).initialResult().block()!!.payload

        return res.toString()
    }

}