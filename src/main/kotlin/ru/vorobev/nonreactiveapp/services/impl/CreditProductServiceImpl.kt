package ru.vorobev.nonreactiveapp.services.impl

import org.springframework.stereotype.Service
import ru.vorobev.nonreactiveapp.repositories.CreditProductRepository
import ru.vorobev.nonreactiveapp.services.CreditProductService

@Service
class CreditProductServiceImpl (val repo : CreditProductRepository) : CreditProductService {

    override fun getCreditProductByActive(isActive: Boolean) = repo.findCreditProductByActive(isActive)


}