package kt.koyakei.nationalBaseRegistry.itemRegistry.domain.model

import kt.koyakei.personInLawRegister.domain.model.PersonInLaw

/**
 * 大量の同一能力の労働者であっても　専門的な変えが聞かない労働者であってもここに入れる
 *　一人の人間が複数のプロバイダーとしても活動することが出来るし、　機械やサービス　モノとセットでのプロバイダーとしても登録できるようにするべきなのか？
 * 分類も必要だろう
 * 能力はどうするべきなのか？
 * 提供者の
 */
class ServiceProvider(override val identifier: GeneralItemFeature.Identifier,
                      override val 従属する要素の実体List: List<従属する要素の実体>, // どんな能力を追っているかなど。
                      override val 分類された要素v: GeneralItemFeature.分類された要素,
                      override val name: String,
                      val personInLawIdentifier: PersonInLaw.Identifier
) : GeneralItemFeature {


}