package com.example.RoboClubPlovdiv.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PROJECTS")
public class Project extends MainModel {

    @Column(name = "NAME", length = 256, nullable = false)
    private String name;
    @Column(name = "PRICE",nullable = false)
    private double price;
    @Column(name = "DESCRIPTION",length = 256)
    private String description;
    @Transient
    private String temp;


    //TODO
    private List<Project> projectList;
    private List<Event> eventList;
    private List<Sponsor> sponsorList;



}
