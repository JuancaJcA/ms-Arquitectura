package com.example.mscustomer.service

import com.example.mscustomer.dto.keyDTO
import com.example.mscustomer.dto.responseKeyDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name="keycloak", url = "http://localhost:8081/realms/software/protocol/openid-connect")
interface KeycloackService  {
    @RequestMapping("/token", consumes = ["application/x-www-form-urlencoded"])
    fun getToken(responseKey: responseKeyDTO): String
}