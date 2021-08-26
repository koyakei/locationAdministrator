package kt.koyakei.applicationalService.driveingRecordingSystem.domain.model

/**
 * 商品カテゴリのツリー構造をもたせるのは別サービスでやる
 * 商標
 * メーカー
 * などを定義
 */
data class CarModel(val identifier: Identifier){
    @JvmInline
    value class Identifier(val id :Long)
}
