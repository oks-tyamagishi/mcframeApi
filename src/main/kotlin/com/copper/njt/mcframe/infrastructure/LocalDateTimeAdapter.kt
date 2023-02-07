package com.copper.njt.mcframe.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class LocalDateTimeAdapter {
    @ToJson
    fun toJson(value: LocalDateTime): String {
        return DateTimeFormatter.ISO_DATE_TIME.format(value)
    }

    @FromJson
    fun fromJson(value: String): LocalDateTime? {
        if(value.isNullOrEmpty()) return null
        val dtf = DateTimeFormatter.ISO_DATE_TIME
        val zdt = ZonedDateTime.parse(value, dtf)
        return zdt.toLocalDateTime()
    }

}
