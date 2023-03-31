package com.example.msconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class MsConfigServerApplication

fun main(args: Array<String>) {
	runApplication<MsConfigServerApplication>(*args)
}
