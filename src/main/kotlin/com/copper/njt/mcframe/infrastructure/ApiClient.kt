package com.copper.njt.mcframe.infrastructure


import okhttp3.Call
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.converter.scalars.ScalarsConverterFactory
import com.squareup.moshi.Moshi
import com.copper.njt.mcframe.authentication.model.ApiKeyAuth
import retrofit2.converter.moshi.MoshiConverterFactory


class ApiClient(
    private var baseUrl: String,
    private val okHttpClientBuilder: OkHttpClient.Builder? = null,
    private val serializerBuilder: Moshi.Builder = Serializer.moshiBuilder,
    private val callFactory : Call.Factory? = null,
    private val converterFactory: Converter.Factory? = null
) {
    var logger: ((String) -> Unit)? = null

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create(serializerBuilder.build()))
            .apply {
                if (converterFactory != null) {
                    addConverterFactory(converterFactory)
                }
            }
    }

    private val clientBuilder: OkHttpClient.Builder by lazy {
        okHttpClientBuilder ?: defaultClientBuilder
    }

    private val defaultClientBuilder: OkHttpClient.Builder by lazy {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(HttpLoggingInterceptor()
                .apply { level = HttpLoggingInterceptor.Level.BODY }
            )
//            .addInterceptor(HttpLoggingInterceptor { message -> logger?.invoke(message) }
    }

    init {
        normalizeBaseUrl()
    }

    constructor(
        baseUrl: String,
        okHttpClientBuilder: OkHttpClient.Builder? = null,
        serializerBuilder: Moshi.Builder = Serializer.moshiBuilder,
        authorization: ApiKeyAuth
    ) : this(baseUrl, okHttpClientBuilder, serializerBuilder) {
        clientBuilder.addInterceptor(authorization)
    }

    fun setLogger(logger: (String) -> Unit): ApiClient {
        this.logger = logger
        return this
    }

    fun <S> createService(serviceClass: Class<S>): S {
        val usedCallFactory = this.callFactory ?: clientBuilder.build()
        return retrofitBuilder.callFactory(usedCallFactory).build().create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }

}
