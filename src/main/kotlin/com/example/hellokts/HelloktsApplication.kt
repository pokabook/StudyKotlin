package com.example.hellokts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloktsApplication

fun main(args: Array<String>) {
    runApplication<HelloktsApplication>(*args)
}
