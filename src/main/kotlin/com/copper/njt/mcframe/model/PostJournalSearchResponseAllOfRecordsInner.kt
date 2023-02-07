/**
 * 仕訳データ検索結果モデル
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.copper.njt.mcframe.model


import com.squareup.moshi.Json

data class PostJournalSearchResponseAllOfRecordsInner (

    /* inpDateType */
    @Json(name = "inpDateType")
    val inpDateType: kotlin.String? = null,

    /* 計上日 From */
    @Json(name = "fromInpDate")
    val fromInpDate: kotlin.String? = null,

    /* 計上日 To */
    @Json(name = "toInpDate")
    val toInpDate: kotlin.String? = null,

    /* 伝票区分 */
    @Json(name = "slipType")
    val slipType: kotlin.String? = null,

    /* 付箋紙区分 */
    @Json(name = "postpadType")
    val postpadType: kotlin.String? = null,

    /* 承認ステータス */
    @Json(name = "approveStatus")
    val approveStatus: kotlin.String? = null,

    /* 伝票発行区分 */
    @Json(name = "voucherPublish")
    val voucherPublish: kotlin.String? = null,

    /* データレベル */
    @Json(name = "dataLevel")
    val dataLevel: kotlin.collections.List<kotlin.String> = mutableListOf(),

    /* 出力データType */
    @Json(name = "hisDateType")
    val hisDateType: kotlin.String? = null,

    /* createDateType */
    @Json(name = "createDateType")
    val createDateType: kotlin.String? = null,

    /* changeDateType */
    @Json(name = "changeDateType")
    val changeDateType: kotlin.String? = null,

    /* approveDateType */
    @Json(name = "approveDateType")
    val approveDateType: kotlin.String? = null,

    /* インポートフラグ */
    @Json(name = "importFlag")
    val importFlag: kotlin.collections.List<kotlin.String> = mutableListOf(),

    /* acType */
    @Json(name = "acType")
    val acType: kotlin.String? = null,

    /* otherAcType */
    @Json(name = "otherAcType")
    val otherAcType: kotlin.String? = null,

    /* 取引先Type */
    @Json(name = "correspType")
    val correspType: kotlin.String? = null,

    /* 貸借区分 */
    @Json(name = "drCrType")
    val drCrType: kotlin.collections.List<kotlin.String> = mutableListOf(),

    /* 入力金額From */
    @Json(name = "fromInpAmountFc")
    val fromInpAmountFc: kotlin.String? = null,

    /* 入力金額To */
    @Json(name = "toInpAmountFc")
    val toInpAmountFc: kotlin.String? = null,

    /* 入力税額From */
    @Json(name = "fromTaxAmountFc")
    val fromTaxAmountFc: kotlin.String? = null,

    /* 入力税額To */
    @Json(name = "toTaxAmountFc")
    val toTaxAmountFc: kotlin.String? = null,

    /* 税対象金額From */
    @Json(name = "fromTaxableAmount")
    val fromTaxableAmount: kotlin.String? = null,

    /* 税対象金額To  */
    @Json(name = "toTaxableAmount")
    val toTaxableAmount: kotlin.String? = null,

    /* 基準金額From */
    @Json(name = "fromInpAmountSc")
    val fromInpAmountSc: kotlin.String? = null,

    /* 基準金額To */
    @Json(name = "toInpAmountSc")
    val toInpAmountSc: kotlin.String? = null,

    /* userDateDType */
    @Json(name = "userDateDType")
    val userDateDType: kotlin.String? = null,

    /* UserQtyD From */
    @Json(name = "fromUserQtyD")
    val fromUserQtyD: kotlin.String? = null,

    /* UserQtyD To */
    @Json(name = "toUserQtyD")
    val toUserQtyD: kotlin.String? = null,

    /* 添付ファイル有無 */
    @Json(name = "isExitsFileFlag")
    val isExitsFileFlag: kotlin.collections.List<kotlin.String> = mutableListOf(),

    /* コメント有無 */
    @Json(name = "isExistsComment")
    val isExistsComment: kotlin.collections.List<kotlin.String> = mutableListOf(),

    /* 会社コード */
    @Json(name = "company")
    val company: kotlin.String? = null,

    /* operator */
    @Json(name = "operator")
    val operator: kotlin.String? = null,

    /* language */
    @Json(name = "language")
    val language: kotlin.String? = null,

    /* 言語 */
    @Json(name = "lang")
    val lang: kotlin.String? = null

)

