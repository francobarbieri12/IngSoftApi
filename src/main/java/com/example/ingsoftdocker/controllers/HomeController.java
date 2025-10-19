package com.example.ingsoftdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Trabajo práctico para Ingeniería de Software de Franco Barbieri";
    }

}
