package eu.ap.zipkin.zipkin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/test")
    fun checkWork(): String {
        return "Success"
    }
}