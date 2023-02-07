package com.copper.njt.mcframe.service.journal.impl

import com.copper.njt.mcframe.api.JournalApi
import com.copper.njt.mcframe.model.*
import com.copper.njt.mcframe.service.journal.commons.JournalService
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service
import retrofit2.awaitResponse

@Service
class JournalServiceImpl (val journalApi: JournalApi) : JournalService {

    override fun search(postJournalSearchRequest: PostJournalSearchRequest): PostJournalSearchResponse? {
        return runBlocking { journalApi.search(postJournalSearchRequest).awaitResponse().body() }
    }

}