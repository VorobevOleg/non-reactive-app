package ru.vorobev.nonreactiveapp.repositories

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import ru.vorobev.nonreactiveapp.testutils.getTestCreditProducts

@DataJpaTest
@ActiveProfiles("tc")
@Testcontainers
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CreditProductRepositoryTest {

    companion object {
        @Container
        private val postgreSQLContainer = PostgreSQLContainer("postgres:15-alpine")

        @DynamicPropertySource
        fun datasourceProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.datasource.url") { postgreSQLContainer.jdbcUrl }
            registry.add("spring.datasource.password") { postgreSQLContainer.password }
            registry.add("spring.datasource.username") { postgreSQLContainer.username }
        }
    }

    @Autowired
    lateinit var repository : CreditProductRepository

    @Test
    @DisplayName("When findCreditProductByActive(true) then return not empty list and has correct size")
    fun whenFindCreditProductByActive_thenReturnNotEmptyListAndHasCorrectSize() {
        val creditProductList = getTestCreditProducts()
        repository.saveAll(creditProductList)
        val activeCreditProductShortList = repository.findCreditProductByActive(true)
        assertThat(activeCreditProductShortList).isNotEmpty
        assertThat(activeCreditProductShortList).hasSize(2)
    }

}