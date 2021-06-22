package kt.koyakei.personIdentifierService.domain.repository

import kt.koyakei.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw


interface PersonalPhotoRepository {
    fun findByUserIdentifier(personInLawIdentifier: PersonInLaw.Identifier): PersonalPhoto.Photo
    fun findUserByPhoto(personalPhoto: PersonalPhoto.Photo): PersonInLaw.Identifier
}