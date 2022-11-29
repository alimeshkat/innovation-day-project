package nl.rabobank.innonative

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class InnonativeApplication

fun main(args: Array<String>) {
    SpringApplication.run(InnonativeApplication::class.java, *args)
}
