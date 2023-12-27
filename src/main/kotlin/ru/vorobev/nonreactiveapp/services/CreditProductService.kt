package ru.vorobev.nonreactiveapp.services

import ru.vorobev.nonreactiveapp.projections.CreditProductShort

/**
 * Сервис для работы с кредитными продуктами
 */
interface CreditProductService {

    /**
     * Получение списка урезанных версий всех активных кредитных продуктов
     *
     * @param isActive активные или нет нужны (true / false)
     * @return список CreditProductShort
     */
    fun getCreditProductByActive(isActive : Boolean) : List<CreditProductShort>
}