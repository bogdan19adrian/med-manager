package ro.go.bogdan.medmanager.users.services;

import ro.go.bogdan.medmanager.users.entities.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();
}