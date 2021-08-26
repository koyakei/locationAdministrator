package kt.koyakei.applicationalService.personIdentifierService.domain.model.repository

import kt.koyakei.applicationalService.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.personInLawRegister.domain.model.PersonInLaw


interface PersonalPhotoRepository {
    fun findByUserIdentifier(personInLawIdentifier: PersonInLaw.Identifier): PersonalPhoto.Photo
    fun findUserByPhoto(personalPhoto: PersonalPhoto.Photo): PersonInLaw.Identifier
}