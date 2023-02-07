/**
 * 仕訳検索リクエストパラメータモデル
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.copper.njt.mcframe.model


import com.squareup.moshi.Json

/**
 * 
 *
 * @param code 役職コードです。
 * @param name 役職名です。
 * @param description 役職の説明です。
 * @param level 役職権限レベル
 */

data class PostJournalSearchRequest (

    /* 会社コード */
    @Json(name = "company")
    val company: kotlin.String,

    /* 社員コード */
    @Json(name = "userID")
    val userID: kotlin.String,

    /* パスワード */
    @Json(name = "password")
    val password: kotlin.String,

    /* 言語 */
    @Json(name = "lang")
    val lang: kotlin.String,

    /* user別API実行Key情報 */
    @Json(name = "userkey")
    val userkey: kotlin.String,

    /* 言語 */
    @Json(name = "data")
    val data: List<DataClass>

    ){
        class DataClass(
            /* 計上日 From */
            @Json(name = "fromInpDate")
            val fromInpDate: kotlin.String,

            /* 計上日 To  */
            @Json(name = "toInpDate")
            val toInpDate: kotlin.String,

            /* 伝票区分 */
            @Json(name = "slipType")
            val slipType: kotlin.String,

            /* データレベル */
            @Json(name = "dataLevel")
            val dataLevel: List<kotlin.String>

        )
    }

