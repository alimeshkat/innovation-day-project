package nl.rabobank.inkpot.rest

import kotlinx.coroutines.delay
import nl.rabobank.inkpot.jpa.PaymentRepository
import nl.rabobank.inkpot.jpa.domain.Payment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld(val paymentRepository: PaymentRepository) {

    @GetMapping("/hello")
    suspend fun greeting(): String {
        println(Thread.currentThread().name)
        paymentRepository.save(Payment(null, "myiban", "yourIban", "baas", "10000", System.currentTimeMillis()))
        paymentRepository.getHigherThan(1)
        delay(1000)
        println(Thread.currentThread().name)
        return "hello"
    }
}
