package ru.vorobev.nonreactiveapp.testutils

import ru.vorobev.nonreactiveapp.entities.CreditProduct
import java.math.BigDecimal

fun getTestCreditProducts(): List<CreditProduct> {
    val cp1 = CreditProduct(
        id = 1,
        name = "Тестовый кредитный продукт №1",
        interestRate = BigDecimal(5),
        amountMin = BigDecimal(10000),
        amountMax = BigDecimal(1000000),
        minDurationMonths = 1,
        maxDurationMonths = 60,
        revocable = true,
        guarantee = true,
        description = "Покупайте то, что нравится",
        image = "https://static3.banki.ru/ugc/9e/26/e2/18/1712-Depositphotos_426403344_xl-2015.jpg",
        active = true
    )
    val cp2 = CreditProduct(
        id = 2,
        name = "Тестовый кредитный продукт №2",
        interestRate = BigDecimal("3.5"),
        amountMin = BigDecimal(10000),
        amountMax = BigDecimal(1000000),
        minDurationMonths = 3,
        maxDurationMonths = 36,
        revocable = true,
        guarantee = false,
        description = "Если хотите сделать важное приобретение",
        image = "https://static3.banki.ru/ugc/9e/26/e2/18/1712-Depositphotos_426403344_xl-2015.jpg",
        active = false
    )
    val cp3 = CreditProduct(
        id = 3,
        name = "Тестовый кредитный продукт №3",
        interestRate = BigDecimal(16),
        amountMin = BigDecimal(10000),
        amountMax = BigDecimal(3000000),
        minDurationMonths = 6,
        maxDurationMonths = 240,
        revocable = true,
        guarantee = false,
        description = "Самый выгодный кредит для большой семьи",
        image = "https://static3.banki.ru/ugc/9e/26/e2/18/1712-Depositphotos_426403344_xl-2015.jpg",
        active = true
    )

    return listOf(cp1, cp2, cp3)
}