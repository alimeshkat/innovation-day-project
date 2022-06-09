package nl.rabobank.inkpot.rest

import nl.rabobank.inkpot.jpa.PaymentRepository
import nl.rabobank.inkpot.jpa.domain.Payment
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NonBlockingController(val paymentRepository: PaymentRepository) {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    @GetMapping("/non-blocking")
    suspend fun greeting(): ResponseEntity<Payment?> = paymentRepository.save(
        Payment(
            null,
            "myiban",
            "toIban",
            "Payment name: ${randomString()}",
            "10000",
            System.currentTimeMillis()
        )
    ).let {
        it.id?.let { payment ->
            ResponseEntity.ok(paymentRepository.findById(payment))
        } ?: ResponseEntity.notFound().build()
    }
    fun randomString() = (1..10)
        .map { allowedChars.random() }
        .joinToString("")
}
