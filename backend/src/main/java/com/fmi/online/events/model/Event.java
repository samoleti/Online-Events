package com.fmi.online.events.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Long creatorId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Date date;

    private Timestamp startTime;

    private Timestamp endTime;

    private String image;

//    private List<Long> attenders;

    @JoinColumn(name = "userId")
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    User user;

    public Event(Long creatorId, @NotNull String name, @NotNull String description, @NotNull Date date) {
        this.creatorId = creatorId;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Event(Long creatorId, @NotNull String name, @NotNull String description, @NotNull Date date, Timestamp startTime, Timestamp endTime, String image) {
        this.creatorId = creatorId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
