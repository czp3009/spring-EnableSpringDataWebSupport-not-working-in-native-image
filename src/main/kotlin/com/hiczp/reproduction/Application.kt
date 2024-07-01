package com.hiczp.reproduction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.domain.PageImpl
import org.springframework.data.web.config.EnableSpringDataWebSupport
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
@SpringBootApplication
class Application

@RestController
class DefaultController {
    @GetMapping("/")
    fun endpoint() = PageImpl(listOf(1, 2))
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
