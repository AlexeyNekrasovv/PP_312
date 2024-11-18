package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;
import java.util.Optional;

//public interface UserService {
//    List<User> getAll();
//
//    User add(User user);
//
//    void update(User updatedUser);
//
//    void delete(Long id);
//
//    Optional<User> findByEmail(String email);
//}

public interface UserService {

    public List<User> findAllUsers();

    public User findUserById(Long userId);

    public void saveUser(User user);

    public boolean updateUser(Long id, User user);

    public boolean deleteUser(Long userId);

    User findByEmail(String email);
}