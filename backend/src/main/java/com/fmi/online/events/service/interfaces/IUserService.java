package com.fmi.online.events.service.interfaces;

import com.fmi.online.events.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User create(User user);
    void update(Long id, User user);
    void delete(Long id);
    List<User> getAll();
    Optional<User> getById(Long id);
}
