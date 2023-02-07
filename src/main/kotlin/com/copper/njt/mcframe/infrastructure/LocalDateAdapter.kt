package com.copper.njt.mcframe.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class LocalDateAdapter {
    @ToJson
    fun toJson(value: LocalDate): String {
        return DateTimeFormatter.ISO_LOCAL_DATE.format(value)
    }

    @FromJson
    fun fromJson(value: String): LocalDate? {
        if(value.isNullOrEmpty()) return null
        return LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE)
    }

}
