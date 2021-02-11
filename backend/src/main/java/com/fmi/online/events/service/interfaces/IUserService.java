package com.fmi.online.events.service.interfaces;

import com.fmi.online.events.model.User;

import java.util.List;

public interface IUserService {
    User register(User user);
    void update(Long id, User user);
    void delete(Long id);
    List<User> getAll();
    User getCurrentlyAuthenticatedUser();
    User getCurrentUser();
    User getById(Long id);
    User getByUsername(String username);
}
