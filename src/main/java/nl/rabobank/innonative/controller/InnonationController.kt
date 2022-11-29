package nl.rabobank.innonative.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class InnonationController( ) {

    @GetMapping("/hello")
    @ResponseBody
    fun hello() = "Hello Native"

}