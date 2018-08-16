package ro.go.bogdan.medmanager.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.go.bogdan.medmanager.users.entities.User;
import ro.go.bogdan.medmanager.users.repository.UserRepository;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/findAll")
    private ResponseEntity<List<User>> findAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
