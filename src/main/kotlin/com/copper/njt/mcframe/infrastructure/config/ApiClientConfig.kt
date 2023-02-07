package com.copper.njt.mcframe.infrastructure.config

import com.copper.njt.mcframe.authentication.model.ApiKeyAuth
import com.copper.njt.mcframe.infrastructure.ApiClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiClientConfig {

    @Value("\${application.mcframe.apiUrl}")
    lateinit var baseUrl:String

    @Bean
    fun getAPIClient(auth: ApiKeyAuth): ApiClient {
        return ApiClient(baseUrl = baseUrl, authorization = auth)
    }
}