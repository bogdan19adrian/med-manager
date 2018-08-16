package ro.go.bogdan.medmanager.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.go.bogdan.medmanager.users.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    public AuthController() {
    }

    @GetMapping("/user")
    public User getUser(){
        return new User();
    }
}