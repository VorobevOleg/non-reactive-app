package ru.vorobev.nonreactiveapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NonReactiveApp

fun main(args: Array<String>) {
    runApplication<NonReactiveApp>(*args)
}