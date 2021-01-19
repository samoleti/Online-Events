package com.fmi.online.events.repository;

import com.fmi.online.events.model.Attender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AttenderRepository extends JpaRepository<Attender, Long> {
    Collection<Attender> findByAttenderId(Long id);

}
