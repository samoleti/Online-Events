package com.fmi.online.events.controller;

import com.fmi.online.events.model.Event;
import com.fmi.online.events.service.AttenderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class AttenderController {

    private AttenderService service;

    @GetMapping("{id}/your-events")
    public Set<Event> getAttendedEvents(@PathVariable Long id) {
        return service.getAttendedEvents(id);
    }
}
