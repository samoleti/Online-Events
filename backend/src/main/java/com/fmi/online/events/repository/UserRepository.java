package com.fmi.online.events.repository;

import com.fmi.online.events.model.Event;
import com.fmi.online.events.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
