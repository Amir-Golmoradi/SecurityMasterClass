package dev.amir.golmoradi.securitymasterclass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class MainTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
        System.out.println("--- Encoded Password ---" + passwordEncoder.encode("password"));
    }

}
