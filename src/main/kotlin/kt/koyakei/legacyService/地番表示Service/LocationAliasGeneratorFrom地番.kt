package kt.koyakei.legacyService.地番表示Service

import kt.koyakei.nationalBaseRegistry.locationRegister.domain.model.AddressAlias

interface LocationAliasGeneratorFrom地番 {
    fun handle():List<AddressAlias>
}