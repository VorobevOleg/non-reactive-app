package ru.vorobev.nonreactiveapp.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.vorobev.nonreactiveapp.entities.CreditProduct
import ru.vorobev.nonreactiveapp.projections.CreditProductShort

@Repository
interface CreditProductRepository : JpaRepository<CreditProduct, Long> {

    /**
     * Получение списка урезанных версий всех активных кредитных продуктов
     *
     * @param isActive активные или нет нужны (true / false)
     * @return List<CreditProductShort>
     */
    fun findCreditProductByActive(isActive : Boolean) : List<CreditProductShort>
}