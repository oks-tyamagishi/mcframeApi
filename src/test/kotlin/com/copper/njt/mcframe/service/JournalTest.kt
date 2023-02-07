package com.copper.njt.mcframe.service

import com.copper.njt.mcframe.McframeApplication
import com.copper.njt.mcframe.model.PostJournalSearchRequest
import com.copper.njt.mcframe.service.journal.commons.JournalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = arrayOf(McframeApplication::class))
class JournalTest {
    @Autowired
    lateinit var journalService: JournalService

    fun journalSearch() {
        var fromInpDate = "2023/01/01"
        var toInpDate = "2023/01/31"
        var slipType = "TRF"
        var dataLevel = mutableListOf<String>()
        dataLevel.add("1")

        var data = PostJournalSearchRequest.DataClass(fromInpDate, toInpDate, slipType, dataLevel)
        var dataList = mutableListOf<PostJournalSearchRequest.DataClass>()
        dataList.add(data)
        var request = PostJournalSearchRequest("NJTM", "MD", "test1", "ja-JP", "testAPI", dataList)

    }
}