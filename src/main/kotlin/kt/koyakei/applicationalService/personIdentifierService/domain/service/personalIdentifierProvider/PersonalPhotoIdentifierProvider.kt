package kt.koyakei.applicationalService.personIdentifierService.domain.service.personalIdentifierProvider

import kt.koyakei.applicationalService.personIdentifierService.domain.model.PersonalIdentificationEvidence
import kt.koyakei.applicationalService.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.applicationalService.personIdentifierService.domain.model.repository.PersonalPhotoRepository
import kt.koyakei.applicationalService.personIdentifierService.domain.service.PersonalIdentifierProvider
import kt.koyakei.naturalBaseRegistry.Item

class PersonalPhotoIdentifierProvider(
    private val personalPhotoRepository: PersonalPhotoRepository,
    private val profilePhotoMatchingService: ProfilePhotoMatchingService
) : PersonalIdentifierProvider<PersonalPhoto.Photo> {

    override fun handle(
        personalIdentificationEvidence: PersonalIdentificationEvidence<PersonalPhoto.Photo>,
        itemIdentifier: Item.Identifier
    ): PersonalIdentifierProvider.本人です =
        PersonalIdentifierProvider.本人です(
            PersonalIdentifierProvider.一致してます(true)== profilePhotoMatchingService.handle(
                personalPhotoRepository.findByUserIdentifier(
                    itemIdentifier
                ), personalIdentificationEvidence.evidence
            )
        )
}