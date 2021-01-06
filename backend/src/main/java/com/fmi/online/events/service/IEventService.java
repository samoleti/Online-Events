package com.fmi.online.events.service;

import com.fmi.online.events.model.Event;

import java.util.List;

public interface IEventService {
    Event create(Event event);
    void update(Long id, Event event);
    void delete(Long id);
    List<Event> getAll();
    Event getById(Long id);
    Event getByCreatorId(Long creatorId);
}
