package kt.koyakei.applicationalService.personIdentifierService.domain.model.repository

import kt.koyakei.applicationalService.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.identityPool.itemIdentifierRegister.domain.model.Item
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

interface PersonalPhotoRepository {
    fun findByUserIdentifier(itemIdentifier: Item.Identifier): PersonalPhoto.Photo
    fun findUserByPhoto(personalPhoto: PersonalPhoto.Photo): PersonInLaw.Identifier
}