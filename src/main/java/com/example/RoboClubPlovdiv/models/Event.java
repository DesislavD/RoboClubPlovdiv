package com.example.RoboClubPlovdiv.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "EVENTS")
public class Event extends MainModel{

    @Column(name = "START_AT",nullable = false)
    private LocalDateTime startAt;
    @Column(name = "END_AT",nullable = false)
    private LocalDateTime endAt;
    @Column(name = "TITLE",unique = true)
    private String title;
    @Column(name = "DESCRIPTION",length = 3000)
    private String description;

//    //TODO
//    @OneToMany(mappedBy = "events")
//    private Set<Event> events;
}
