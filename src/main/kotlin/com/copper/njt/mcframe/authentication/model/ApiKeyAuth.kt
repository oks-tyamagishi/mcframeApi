package com.copper.njt.mcframe.authentication.model

import java.io.IOException
import java.net.URI
import java.net.URISyntaxException

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyAuth(
        val collaboApiKey: String = ""
) : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

//        request = request.newBuilder()
//            .addHeader( "X-Collaboflow-Authorization", collaboApiKey)
//            .build()

        return chain.proceed(request)
    }
}
