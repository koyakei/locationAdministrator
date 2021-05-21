package kt.koyakei.administrativeLocationRegister.event

import org.axonframework.commandhandling.CommandHandler
import org.springframework.stereotype.Service


@Service
class LocationCommandHandler() {
    @CommandHandler
    fun on(locationUpdateCommand: LocationUpdateCommand) {

    }
}