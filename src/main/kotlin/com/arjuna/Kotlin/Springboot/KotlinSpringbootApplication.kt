package com.arjuna.Kotlin.Springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringbootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringbootApplication>(*args)
}
