package com.copper.njt.mcframe.enum

import java.lang.Exception

/**
 * 処理結果区分
 */
enum class SHORI_KEKKA_TYPE(
    val code: String,
    val label: String
) {

    OK("OK", "OK"),
    NG("NG", "NG");

    companion object {
        fun getStringByCode(code: String): SHORI_KEKKA_TYPE = SHORI_KEKKA_TYPE.values().find { it.code == code } ?: throw Exception("ENUM NOT FOUND => " + SHORI_KEKKA_TYPE::class.java.name)
    }
}

/**
 * 申請アクション区分
 */
enum class DOCUMENT_ACTION_TYPE(
        val code: String,
        val label: String
) {

    DRAFT("draft", "下書き"),
    MAIN("", "本申請");

    companion object {
        fun getStringByCode(code: String): DOCUMENT_ACTION_TYPE = DOCUMENT_ACTION_TYPE.values().find { it.code == code } ?: throw Exception("ENUM NOT FOUND => " + DOCUMENT_ACTION_TYPE::class.java.name)
    }
}

/**
 * キーコード区分
 */
enum class KEY_CODE_TYPE(
    val code: String,
    val label: String
) {

    ID("", "ID指定"),
    CODE("code", "コード指定"),
    USERID("userid", "ユーザーID指定");

    companion object {
        fun getStringByCode(code: String): KEY_CODE_TYPE = KEY_CODE_TYPE.values().find { it.code == code } ?: throw Exception("ENUM NOT FOUND => " + KEY_CODE_TYPE::class.java.name)
    }
}



