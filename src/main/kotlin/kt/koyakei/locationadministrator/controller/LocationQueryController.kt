package kt.koyakei.locationadministrator.controller

import kt.koyakei.locationadministrator.aggregate.LocationPrice
import kt.koyakei.locationadministrator.event.LocationReadQuery
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
        val res: LocationPrice = queryBus.subscriptionQuery(
            GenericSubscriptionQueryMessage(
                LocationReadQuery(id),
                ResponseTypes.instanceOf(LocationPrice::class.java),
                ResponseTypes.instanceOf(LocationPrice::class.java)
            )
        ).initialResult().block()!!.payload
        return res.toString()
    }

}