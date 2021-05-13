package kt.koyakei.locationadministrator.controller

//import kt.koyakei.locationadministrator.event.LocationUpdateCommand
import kt.koyakei.locationadministrator.event.LocationCreateCommand
import kt.koyakei.locationadministrator.event.LocationUpdateCommand
import org.axonframework.commandhandling.CommandBus
import org.axonframework.commandhandling.GenericCommandMessage
import org.springframework.web.bind.annotation.*
import reactor.kotlin.core.publisher.toMono

@RestController
class LocationCommandController(
    private val commandBus: CommandBus
    ) {

    @GetMapping("/create/{price}")
    @ResponseBody
    fun index(
              @PathVariable("price") price: Long
    ) :String{
        val id = "1"
//            UUID.randomUUID().toString()
        commandBus.dispatch(GenericCommandMessage(
            LocationCreateCommand(id,price)
        ))

        return id
    }

    @GetMapping("/update/{id}/{price}")
    @ResponseBody
    fun update(
        @PathVariable("id") id: String,
        @PathVariable("price") price: Long
    ) :String {
        return commandBus.dispatch(
            GenericCommandMessage(
                LocationUpdateCommand(price,id)
            )).toMono().toString()
    }


}