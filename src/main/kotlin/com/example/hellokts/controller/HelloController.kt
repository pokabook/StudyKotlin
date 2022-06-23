package com.example.hellokts.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello(): ResponseEntity<String>{
        val hello = "hello";
        return ResponseEntity.ok(hello);
    }
}