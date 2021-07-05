package kt.koyakei.administrativeLocationRegister.controller

import kt.koyakei.administrativeLocationRegister.command.LocationCreateCommand
import kt.koyakei.administrativeLocationRegister.command.LocationUpdateCommand
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
        return commandBus.dispatch(GenericCommandMessage(
            LocationCreateCommand(id,price)
        )).toMono().thenReturn(String).toString()


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