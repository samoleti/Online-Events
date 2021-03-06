package com.fmi.online.events.controller;

import com.fmi.online.events.model.User;
import com.fmi.online.events.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return service.getAll();
    }

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user) {
        return service.create(user);
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return service.getById(id)
                .map(event -> ResponseEntity.ok().body(event))
                .orElseGet( () -> ResponseEntity.notFound().build());
    }

    @PutMapping("api/users/{id}")
    public void update(@PathVariable Long id, @RequestBody User user) {
        service.update(id, user);
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.delete(id);
    }


}
