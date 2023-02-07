/**
 * 仕訳データ検索レスポンスモデル
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
 * @param records
 * @param error
 */

data class PostJournalSearchResponse (

    @Json(name = "records")
    val records: kotlin.collections.List<PostJournalSearchResponseAllOfRecordsInner>? = null,

    @Json(name = "status")
    val status: kotlin.String,

    @Json(name = "message")
    val message: kotlin.String

)

