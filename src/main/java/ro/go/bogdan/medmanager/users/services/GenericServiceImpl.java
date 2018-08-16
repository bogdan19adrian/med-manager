package ro.go.bogdan.medmanager.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import ro.go.bogdan.medmanager.users.entities.User;
import ro.go.bogdan.medmanager.users.repository.UserRepository;

import java.util.List;

public class GenericServiceImpl implements GenericService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

}
