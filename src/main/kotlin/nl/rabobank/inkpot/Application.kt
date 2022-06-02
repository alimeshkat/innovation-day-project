package nl.rabobank.inkpot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["nl.rabobank"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
