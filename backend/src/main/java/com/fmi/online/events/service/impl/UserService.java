package com.fmi.online.events.service.impl;

import com.fmi.online.events.model.User;
import com.fmi.online.events.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.saveAndFlush(user);
    }

    public void update(Long id, User user) {
        if(repository.findById(id).isPresent()) {
            user.setId(id);
            repository.save(user);
        }
    }

    public void delete(Long id) {
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
        }
    }
    public List<User> getAll() {
        return repository.findAll();
    }

    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }

}
