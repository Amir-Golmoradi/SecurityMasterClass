package dev.amir.golmoradi.securitymasterclass.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<String> getAllUser() {
        return ResponseEntity.ok("--- All Users ---");
    }
}
