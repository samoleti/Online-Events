package com.fmi.online.events.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    private Long creatorId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private LocalDate date;

    private LocalTime start;

    private  LocalTime end;

    private String image;

//    private List<Long> attenders;

    public Event(Long creatorId, @NotNull String name, @NotNull String description, @NotNull LocalDate date) {
        this.creatorId = creatorId;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Event(Long creatorId, @NotNull String name, @NotNull String description, @NotNull LocalDate date, LocalTime start, LocalTime end, String image) {
        this.creatorId = creatorId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.start = start;
        this.end = end;
        this.image = image;
    }

    public Event() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
