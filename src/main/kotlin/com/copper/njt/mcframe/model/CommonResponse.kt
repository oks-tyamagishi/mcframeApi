/**
 * 共通レスポンス
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
 * @param error 処理に失敗したら true になります。
 * @param messages 
 */

data class CommonResponse (

    /* 処理に失敗したら true になります。 */
    @Json(name = "error")
    val error: kotlin.Boolean,

    @Json(name = "messages")
    val messages: kotlin.collections.List<kotlin.String>

)

