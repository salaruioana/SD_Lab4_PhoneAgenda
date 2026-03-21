package com.sd.laborator.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AgendaGuiController {
    @GetMapping("/gui")
    fun index(): String {
        return "index" // Cauta src/main/resources/templates/index.html
    }
}