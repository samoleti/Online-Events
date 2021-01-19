package com.fmi.online.events.model;

import javax.persistence.*;

@Entity
@Table(name = "attenders")
public class Attender {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long attenderId;

    private Long eventId;

    public Attender(Long id, Long attenderId, Long eventId) {
        this.id = id;
        this.attenderId = attenderId;
        this.eventId = eventId;
    }

    public Long getAttenderId() {
        return attenderId;
    }

    public void setAttenderId(Long attenderId) {
        this.attenderId = attenderId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

}
