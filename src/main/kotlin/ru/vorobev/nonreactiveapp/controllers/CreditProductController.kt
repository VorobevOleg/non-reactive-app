package ru.vorobev.nonreactiveapp.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.vorobev.nonreactiveapp.projections.CreditProductShort
import ru.vorobev.nonreactiveapp.services.CreditProductService

@RestController
@RequestMapping("/api/v1/credit-products")
class CreditProductController(val service: CreditProductService) {

    @GetMapping
    fun getCreditProductByActive(@RequestParam isActive : Boolean) : ResponseEntity<List<CreditProductShort>> {
        return ResponseEntity(service.getCreditProductByActive(isActive), HttpStatus.OK)
    }
}