package kt.koyakei.privateCompany.postalCodeRegister.dataStore

import kt.koyakei.privateCompany.postalCodeRegister.model.JapanPostalCode

interface AllocateJapanPostalCodeToLocationRepository {
    fun save(japanPostalCodeAllocateToLocationCommand: JapanPostalCodeAllocateToLocationCommand): JapanPostalCode
}