package com.fmi.online.events.service.impl;

import com.fmi.online.events.model.User;
import com.fmi.online.events.repository.UserRepository;
import com.fmi.online.events.service.interfaces.IUserService;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User register(User user) {
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

    @Override
    public User getCurrentlyAuthenticatedUser() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        User user = (User) securityContext.getAuthentication().getPrincipal();
        return user;
    }

    @Override
    public User getCurrentUser() {
        User currentUser = this.getCurrentlyAuthenticatedUser();
        Long id = currentUser.getId();
        User user = this.getById(id);
        return user;
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User getByUsername(String username) {
        return repository.findByUsername(username).orElse(null);
    }
    public List<User> getAll() {
        return repository.findAll();
    }

}
