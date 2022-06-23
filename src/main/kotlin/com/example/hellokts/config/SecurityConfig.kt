package com.example.hellokts.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@Configuration
@EnableWebSecurity
class SecurityConfig(
    private val tokenProvider : TokenProvider,
    private val customAuthDetailsService : CustomAuthDetailsService
) {

}