package ro.go.bogdan.medmanager.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping("/deleteUser/{id}")
    private ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long id){
        if(!userRepository.findById(id).isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            userRepository.delete(userRepository.findById(id).get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PutMapping("/updateUser")
    private ResponseEntity<User> updateUser(@RequestBody User user){
        if(!userRepository.findById(user.getId()).isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
        }
    }
}
