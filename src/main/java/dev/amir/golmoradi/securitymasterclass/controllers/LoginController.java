package dev.amir.golmoradi.securitymasterclass.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {

    @GetMapping
    public String login() {
        return "Welcome To Login Page";
    }
}
