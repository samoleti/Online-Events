package com.fmi.online.events.service.interfaces;

import com.fmi.online.events.model.Event;

import java.util.List;
import java.util.Set;

public interface IEventService {
    Event create(Event event);
    void update(Long id, Event event);
    void delete(Long id);
    List<Event> getAll();
    Event getById(Long id);
    Set<Event> getEventsByCreatorId(Long creatorId);
}
