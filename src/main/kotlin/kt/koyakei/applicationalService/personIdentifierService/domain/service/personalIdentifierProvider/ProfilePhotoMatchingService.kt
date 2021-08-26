package kt.koyakei.applicationalService.personIdentifierService.domain.service.personalIdentifierProvider

import kt.koyakei.applicationalService.personIdentifierService.domain.model.personalPhoto.PersonalPhoto
import kt.koyakei.applicationalService.personIdentifierService.domain.service.PersonalIdentifierProvider

/**
 * その場で顔写真の確認をするときに、アプリで撮影した写真と証拠を照合するライブラリを外部から呼ぶ
 */
interface ProfilePhotoMatchingService {
    fun handle(proposedPhoto: PersonalPhoto.Photo, evidencePhoto: PersonalPhoto.Photo): PersonalIdentifierProvider.一致してます
}