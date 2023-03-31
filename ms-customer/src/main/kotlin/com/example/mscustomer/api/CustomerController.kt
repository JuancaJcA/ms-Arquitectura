package com.example.mscustomer.api

import com.example.mscustomer.dto.keyDTO
import com.example.mscustomer.dto.responseKeyDTO
import com.example.mscustomer.service.AccountService
import com.example.mscustomer.service.KeycloackService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController @Autowired constructor(private val accountService: AccountService, private val keycloackService: KeycloackService) {
    @Value("7070")
    lateinit var port: String

    @GetMapping("/test")
    fun test(): String {
        val result = accountService.test()
        return "Server Port: $port Another Server Port: $result"
    }

    @GetMapping("/list")
    fun getCustomers(): List<String> {
        return listOf("John", "Jane","Jack", "Jill") + accountService.getAccounts()
    }

    @GetMapping("/key")
    fun getKey(): String {
        var responseKey = responseKeyDTO("client_credentials", "backend", "B7CqOW2LLx83ejsoA9eh0H2kUaFcWaaX")
        return keycloackService.getToken(responseKey)
    }

}