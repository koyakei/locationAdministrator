package kt.koyakei.core.domain.model.tag.business_service

import kt.koyakei.core.domain.model.tag.BusinessOwner

interface BusinessService {
    val businessOwner: BusinessOwner //鉄道であれば、路線など
}