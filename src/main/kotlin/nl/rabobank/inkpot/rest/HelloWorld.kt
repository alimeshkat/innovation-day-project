package nl.rabobank.inkpot.rest

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

    @GetMapping("/hello")
    suspend fun greeting(): String {
        println(Thread.currentThread().name)
        delay(1000)
        println(Thread.currentThread().name)
        return "hello"
    }
}
