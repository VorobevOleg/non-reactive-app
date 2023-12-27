package ru.vorobev.nonreactiveapp.projections

import java.math.BigDecimal

/**
 * Урезанная проекция для сущности кредитный продукт
 */
data class CreditProductShort(
    val name: String,
    val interestRate: BigDecimal,
    val amountMax: BigDecimal,
    val maxDurationMonths: Int,
    val description: String? = null,
    val image: String? = null
)
