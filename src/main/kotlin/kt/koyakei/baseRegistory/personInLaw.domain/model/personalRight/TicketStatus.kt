package kt.koyakei.personInLawRegister.domain.model.personalRight

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

data class TicketStatus(
    val personInLawIdentifier: PersonInLaw.Identifier,
    val personalTicketList: List<PersonalTicket>
)
