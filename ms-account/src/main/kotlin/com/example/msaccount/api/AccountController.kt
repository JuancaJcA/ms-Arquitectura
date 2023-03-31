package com.example.msaccount.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController @Autowired constructor(){
    @Value("6060")
    lateinit var port: String

    @GetMapping("/test")
    fun test(): String {
        return "Server Port: $port"
    }

    @GetMapping("/list")
    fun getAccounts() = listOf("Account 1", "Account 2","Account 3", "Account 4")
}