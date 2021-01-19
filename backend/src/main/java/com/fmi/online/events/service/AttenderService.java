package com.fmi.online.events.service;

import com.fmi.online.events.model.Attender;
import com.fmi.online.events.model.Event;
import com.fmi.online.events.model.User;
import com.fmi.online.events.repository.AttenderRepository;
import com.fmi.online.events.service.impl.EventService;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class AttenderService {

    private AttenderRepository repository;
    private EventService eventService;

    public Collection<Attender> getById(Long id) {
        return repository.findByAttenderId(id);
    }

    public Set<Event> getAttendedEvents(Long id) {
        return repository.findByAttenderId(id)
                .stream()
                .map(attender -> attender.getEventId())
                .map(eventId -> eventService.getById(eventId))
                .collect(Collectors.toSet());
    }

}
