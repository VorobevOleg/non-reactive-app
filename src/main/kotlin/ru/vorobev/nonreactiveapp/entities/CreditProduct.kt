package ru.vorobev.nonreactiveapp.entities

import jakarta.persistence.*
import java.math.BigDecimal

/**
 * Сущность кредитный продукт
 */
@Entity
@Table(name = "credit_products")
data class CreditProduct(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column(nullable = false, unique = true)
    val name: String,

    @Column(precision = 6, scale = 4, nullable = false)
    val interestRate: BigDecimal,

    @Column(precision = 19, scale = 4, nullable = false)
    val amountMin: BigDecimal,

    @Column(precision = 19, scale = 4, nullable = false)
    val amountMax: BigDecimal,

    @Column(nullable = false)
    private val minDurationMonths: Int,

    @Column(nullable = false)
    val maxDurationMonths: Int,

    @Column(name = "is_revocable", nullable = false)
    val revocable: Boolean,

    @Column(name = "is_guarantee", nullable = false)
    val guarantee: Boolean,

    @Column(name = "description")
    val description: String? = null,

    @Column(name = "image")
    val image: String? = null,

    @Column(name = "is_active", nullable = false)
    val active: Boolean
)
