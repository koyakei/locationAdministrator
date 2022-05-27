package kt.koyakei.privateCompany.postalCodeRegister.dataStore

import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

interface JapanPostalCodeRepository {
    fun save(savePostalCodeCommand: SavePostalCodeCommand): JapanPostalCode
}