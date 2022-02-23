package kt.koyakei.applicationalService.lawAndOrder.domain.model.codeOfLaw.criminalLaw

/**
 * 構成要件に該当するかは何罪に当たるのかを人間で当たりをつけてから判定すると良いと思う
 * 判定基準はいろいろだから注入するんじゃやないの？
 * 関数の引数に型引数をとれないから、いちいち判定ロジックごとに事実を代入しなきゃいけない　まちがいのもとだ。
 */
class 有罪無罪判定(
    構成要件該当性判定: 構成要件該当性判定<out 刑事的事実>,
    違法性阻却判定: 違法性阻却判定<out 刑事的事実>,
    有責判定: 有責判定<out 刑事的事実>,
    v刑事責任年齢判定: 刑事責任年齢判定
) {
    val 構成要件に該当する = 構成要件該当性(true)
    val 違法性の阻却事由がない = 違法性阻却の有無(false)
    val 刑事的責任あり = 刑事的責任の有無(true)

    /**
     * 刑事的事実が構成要件に該当した場合
     * でなおかつ違法性阻却がない場合
     * でなおかつ有責な場合は有罪である。
     */
    val handle = IsGuilty( boolean =
        v刑事責任年齢判定.handle() == 刑事的責任あり &&
                構成要件該当性判定.handle() == 構成要件に該当する
                && 違法性阻却判定.handle() == 違法性の阻却事由がない
                && 有責判定.handle() == 刑事的責任あり
    )


    @JvmInline
    value class 構成要件該当性(val boolean: Boolean)


    /**
     *  true 違法性を阻却する
     *  false 違法性を阻却しない
     */
    @JvmInline
    value class 違法性阻却の有無(val boolean: Boolean)

    @JvmInline
    value class 刑事的責任の有無(val boolean: Boolean)


}