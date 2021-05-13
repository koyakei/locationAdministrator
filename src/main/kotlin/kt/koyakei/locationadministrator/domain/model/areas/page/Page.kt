package kt.koyakei.core.domain.model.areas.page


import kt.koyakei.core.domain.model.areas.Area


interface Page<out T: Page.PageIdentifier> : Area<T> {
    override val areaIdentifier: T
    interface PageIdentifier: Area.AreaIdentifier
}