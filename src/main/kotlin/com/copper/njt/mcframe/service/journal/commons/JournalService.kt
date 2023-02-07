package com.copper.njt.mcframe.service.journal.commons

import com.copper.njt.mcframe.model.*

/**
 * APIをラッピングした基本サービス
 * 引数と戻り値のオブジェクトは、当APIと同様
 * 想定するAPIは「グループ情報の取得」「グループ情報の一括取得」「グループ情報の一括登録・更新」「グループ情報の一括削除」
 */
interface JournalService {
    fun search(postJournalSearchRequest: PostJournalSearchRequest): PostJournalSearchResponse?

}