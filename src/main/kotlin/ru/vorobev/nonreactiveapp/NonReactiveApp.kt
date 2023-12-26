package ru.vorobev.nonreactiveapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NonReactiveAppApplication

fun main(args: Array<String>) {
    runApplication<NonReactiveAppApplication>(*args)
}
