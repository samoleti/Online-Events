package com.fmi.online.events.service.impl;

import com.fmi.online.events.model.Event;
import com.fmi.online.events.repository.EventRepository;
import com.fmi.online.events.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event create(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public void update(Long id, Event event) {

        if(eventRepository.findById(id).isPresent()) {
            event.setId(id);
            eventRepository.save(event);
        }
    }

    @Override
    public void delete(Long id) {
        if(eventRepository.findById(id).isPresent()){
            eventRepository.deleteById(id);
        }
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event getByCreatorId(Long creatorId) {
        return null;
    }
}
