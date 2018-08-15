package ro.go.bogdan.medmanager.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.go.bogdan.medmanager.users.User;
import ro.go.bogdan.medmanager.users.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
      return  userRepository.findAll();
    }
}
