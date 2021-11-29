package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class HelloController {
    @GetMapping("hello")
    fun hello(@RequestParam("name") name: String): Response {
        return Response("Hello $name!")
    }
}

data class Response(val message: String)
