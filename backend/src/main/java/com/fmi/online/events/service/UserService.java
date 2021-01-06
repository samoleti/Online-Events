package com.fmi.online.events.service;

import com.fmi.online.events.model.user.User;
import com.fmi.online.events.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository repository;

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


}
