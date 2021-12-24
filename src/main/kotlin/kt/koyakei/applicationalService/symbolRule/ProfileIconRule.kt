package kt.koyakei.applicationalService.symbolRule

import javax.swing.ImageIcon

/**
 * アイコンの設定　視聴覚障害者にはサウンドロゴ
 * シンボルがなきゃわかりにくい　絶対サウンドロゴは障害者配慮のために必要なのかどうかをここで定義する
 *
 */
interface ProfileIconRule {
    val imageIcon: ImageIcon
    val soundLogo: ByteArray
}