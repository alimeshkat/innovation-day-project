package nl.rabobank.inkpot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["nl.rabobank.*"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
