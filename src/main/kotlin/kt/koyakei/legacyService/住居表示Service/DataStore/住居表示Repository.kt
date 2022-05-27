package kt.koyakei.legacyService.住居表示Service.DataStore

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.Location

interface 住居表示Repository {
    fun findBtName(): Location
}