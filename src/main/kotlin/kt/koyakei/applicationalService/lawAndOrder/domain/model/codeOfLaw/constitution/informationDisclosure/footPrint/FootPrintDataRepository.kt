package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

interface FootPrintDataRepository {
    fun save(footPrintData: FootPrintData): FootPrintData
}