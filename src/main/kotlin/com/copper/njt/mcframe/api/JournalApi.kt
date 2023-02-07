package com.copper.njt.mcframe.api

//import com.copper.njt.mcframe.model.DeleteDocument200Response
//import com.copper.njt.mcframe.model.GetDetermsResponse
import com.copper.njt.mcframe.model.PostJournalSearchResponse
import com.copper.njt.mcframe.model.PostJournalSearchRequest
import retrofit2.Call
import retrofit2.http.*

interface JournalApi {

    /**
     * 申請書の申請・下書き保存
     *
     * Responses:
     *  - 201: 申請された申請書に関する情報が返ります。
     *  - 400: 必須項目の未入力や文字数制限の超過、無効な申請経路の指定などにより申請に失敗した場合の応答です。
     *  - 500: サーバーにて想定外のエラーが発生した場合の応答です。
     *
     * @param requestDocumentRequest * {PARTSID_xxxxx} はプレースホルダーです。実際には作成したフォーム内の「パーツID」を指定してください。 * {TABLE_TITLE} はプレースホルダーです。実際には表パーツの「テーブルタイトル」を指定してください。   * 通常フォームでは複数のテーブルを配置できますが、テーブルタイトルは重複しないように予めフォームを準備してください。   * Excelフォームの場合はテーブルタイトルとして、「table」を指定してください。 * 省略したパーツは、各パーツのデフォルト値で登録されます。 * 自動計算パーツの値は自動的に計算されて登録されるため送信不要です。 * 複数の添付ファイルパーツに同じファイルIDを指定する事はできません。 * Excel添付取込パーツの登録には対応していません。 * 申請せず下書きに保存する場合はアクション（下書き保存）を指定してください。下書き保存時は入力必須チェックは行われません。  (optional)
     * @return [Call]<[RequestDocumentResponse]>
     */
//    @POST("documents")
//    fun requestDocument(@Body requestDocumentRequest: RequestDocumentRequest? = null): Call<RequestDocumentResponse>

    /**
     * 仕訳データを検索
     * Responses:
     *  - 200: 申請書の各パーツの値と状態が返ります。
     *  - 400: 受信したパラメーターに問題があるため処理を中止した場合の応答です。
     *  - 403: 対象のリソースに対してアクセスできないか、指定の操作が出来ない場合の応答です。
     *  - 404: 対象のリソースが存在しない場合の応答です。
     *
     * @param postJournalSearchRequest リクエストモデル
     * @return [Call]<[PostJournalSearchResponse]>
     */
    @POST("publish/journal/search")
    fun search(@Body postJournalSearchRequest: PostJournalSearchRequest? = null): Call<PostJournalSearchResponse>

    /**
     * 文書の削除
     * * 下書き中の申請書は、以下のユーザーのみ削除する事ができます。   * 下書きを作成したユーザー   * 代理で下書きした場合、代理で作成したユーザー * 申請済みの申請書は、システム管理者ユーザーのみ削除する事ができます。
     * Responses:
     *  - 200: 削除した文書のIDが返ります。
     *  - 400: 不正な文書IDやアプリケーションコードを指定して、エラーとなった場合の応答です。
     *  - 403: 削除できないユーザーで実行し、エラーとなった場合の応答です。
     *  - 404: 存在しない文書IDを指定して、エラーとなった場合の応答です。
     *
     * @param documentId 文書IDを指定します。
     * @param appCd コラボフローアプリケーションのコードを指定します。
     * @return [Call]<[DeleteDocument200Response]>
     */
//    @DELETE("documents/{document_id}")
//    fun deleteDocument(@Path("document_id") documentId: kotlin.Int, @Query("app_cd") appCd: kotlin.Int): Call<DeleteDocument200Response>


    /**
     * 判定者の一覧取得
     * * 申請済み申請書の判定者一覧は、以下のユーザーのみ取得する事ができます。   * 申請者本人または代理申請者   * 判定を行ったユーザー   * 監査権限が付与されたグループに所属するユーザー   * システム管理者ユーザー   * 申請書の申請部署に所属するユーザー     * ポリシー設定「所属部署で申請されたすべての申請を検索可能にする」がONの場合のみ   * フォームの検索許可が設定されているグループに所属するユーザー     * フォームの検索許可が設定されている申請書のみ   * 文書公開経路アイテムで公開先に指定されているグループに所属するユーザー     * 文書公開経路アイテムを通過した申請書のみ
     * Responses:
     *  - 200: 文書情報の概要が返ります。
     *  - 400: 不正な文書IDやアプリケーションコードを指定して、エラーとなった場合の応答です。
     *  - 403: 閲覧できないユーザーで実行し、エラーとなった場合の応答です。
     *  - 404: 存在しない文書IDを指定して、エラーとなった場合の応答です。
     *
     * @param documentId 文書IDを指定します。
     * @param appCd コラボフローアプリケーションのコードを指定します。
     * @param offset 取得開始レコードのオフセットです。次ページを取得したい場合はlimitを足した値を指定します。 (optional, default to 0)
     * @param limit 一度に取得するレコード数です。 (optional, default to 10)
     * @param current 判定待ちの段階のみ取得するかを指定します。 (optional)
     * @return [Call]<[GetDetermsResponse]>
     */
//    @GET("documents/{document_id}/determs")
//    fun getDeterms(@Path("document_id") documentId: kotlin.Int, @Query("app_cd") appCd: kotlin.Int, @Query("offset") offset: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Query("current") current: kotlin.Boolean? = null): Call<GetDetermsResponse>

}
