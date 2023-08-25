package ru.kulakov.authorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registry")
    public String showRegPage(){
        return "registration.html";
    }
}
