package ro.go.bogdan.medmanager.users.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    public AuthController() {
    }

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}