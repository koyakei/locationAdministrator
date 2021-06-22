package kt.koyakei.personIdentifierService.domain.service.personalIdentifierProvider

import kt.koyakei.personIdentifierService.domain.model.PersonalIdentificationEvidence
import kt.koyakei.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.personIdentifierService.domain.repository.PersonalPhotoRepository
import kt.koyakei.personIdentifierService.domain.service.PersonalIdentifierProvider
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

class PersonalPhotoIdentifierProvider(
    private val personalPhotoRepository: PersonalPhotoRepository,
    private val profilePhotoMatchingService: ProfilePhotoMatchingService
) : PersonalIdentifierProvider<PersonalPhoto.Photo> {

    override fun handle(
        personalIdentificationEvidence: PersonalIdentificationEvidence<PersonalPhoto.Photo>,
        personInLawIdentifier: PersonInLaw.Identifier
    ): PersonalIdentifierProvider.本人です =
        PersonalIdentifierProvider.本人です(
            PersonalIdentifierProvider.一致してます(true)== profilePhotoMatchingService.handle(
                personalPhotoRepository.findByUserIdentifier(
                    personInLawIdentifier
                ), personalIdentificationEvidence.evidence
            )
        )
}