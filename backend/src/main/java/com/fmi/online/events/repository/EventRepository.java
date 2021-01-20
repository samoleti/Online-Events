package com.fmi.online.events.repository;

import com.fmi.online.events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Set<Event> findByCreatorId(Long id);
}
