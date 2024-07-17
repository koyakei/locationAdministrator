package kt.koyakei.personInLawRegister.domain.model.personalRight

import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

data class TicketStatus(
    val personInLawIdentifier: PersonInLaw.Identifier,
    val personalTicketList: List<PersonalTicket>
)
