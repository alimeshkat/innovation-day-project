package nl.rabobank.inkpot.jpa.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Table(name = "PAYMENT")
data class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val fromIban: String,
    val toIban: String,
    val name: String,
    val amount: String,
    val date: Long
)
