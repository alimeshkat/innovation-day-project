package nl.rabobank.inkpot.jpa

import nl.rabobank.inkpot.jpa.domain.Payment
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

interface PaymentRepository : CoroutineCrudRepository<Payment, Int>{

    @Query("SELECT * FROM payment p where p.amount >= :value")
    suspend fun getHigherThan(value: Int) : Payment
}

