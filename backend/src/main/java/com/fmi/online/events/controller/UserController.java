package com.fmi.online.events.controller;

import com.fmi.online.events.model.user.User;
import com.fmi.online.events.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class UserController {
    private UserService service;

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return service.getAll();
    }

    @PostMapping("/api/users")
    public User createUser(@PathVariable User user) {
        return service.create(user);
    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return new User(id);
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.delete(id);
    }
}
