package kt.koyakei.lawAndOrder.domain.model.codeOfLaw.constitution.informationDisclosure.footPrint

interface FootPrintDataRepository {
    fun save(footPrintData: FootPrintData): FootPrintData
}