package com.copper.njt.mcframe.authentication.config

import com.copper.njt.mcframe.authentication.model.ApiKeyAuth
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AuthConfig {

    @Value("\${application.mcframe.key}")
    lateinit var apiKey:String

    @Bean
    fun getApiKeyAuth(): ApiKeyAuth {
        return ApiKeyAuth(apiKey)
    }
}