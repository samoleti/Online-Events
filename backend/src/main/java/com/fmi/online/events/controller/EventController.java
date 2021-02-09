package com.fmi.online.events.controller;

import com.fmi.online.events.model.Event;
import com.fmi.online.events.service.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:8081")
public class EventController {
    @Autowired
    private IEventService eventService;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public void create(@Valid @RequestBody Event event) {
        System.out.println(event);
        eventService.create(event);
    }

    @GetMapping
    public List<Event> getAll() {
        return eventService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getEvent(@PathVariable Long id) {
        return Optional
                .ofNullable(eventService.getById(id))
                .map(event -> ResponseEntity.ok().body(event))
                .orElseGet( () -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.eventService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Event event) {
        eventService.update(id, event);
    }

    @GetMapping("{id}/your-events")
    public Set<Event> getCreatedEvents(@PathVariable Long id) {
        return eventService.getEventsByCreatorId(id);
    }

}
