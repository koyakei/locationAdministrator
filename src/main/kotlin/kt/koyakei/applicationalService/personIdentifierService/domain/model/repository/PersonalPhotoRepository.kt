package kt.koyakei.applicationalService.personIdentifierService.domain.model.repository

import kt.koyakei.applicationalService.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.naturalBaseRegistry.Item
import kt.koyakei.identityPool.personInLaw.domain.model.PersonInLaw

interface PersonalPhotoRepository {
    fun findByUserIdentifier(itemIdentifier: Item.Identifier): PersonalPhoto.Photo
    fun findUserByPhoto(personalPhoto: PersonalPhoto.Photo): PersonInLaw.Identifier
}