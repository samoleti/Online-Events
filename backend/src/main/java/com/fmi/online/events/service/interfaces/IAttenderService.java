package com.fmi.online.events.service.interfaces;

import com.fmi.online.events.model.Attender;
import com.fmi.online.events.model.Event;

import java.util.Collection;
import java.util.Set;

public interface IAttenderService {
    public Collection<Attender> getById(Long id);
    public Set<Event> getAttendedEvents(Long id);
}
