package com.example.hellokts.config.jwt.env

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("jwt")
@ConstructorBinding
data class JwtProperty(
    val secretKey: String,
    val accessExpired: Long,
    val refreshExpired: Long
)
