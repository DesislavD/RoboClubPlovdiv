package com.example.RoboClubPlovdiv.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PROJECTS")
public class Project extends MainModel {

    @Column(length = 256, name = "NAME", nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = true)
    private String description;
    @Transient
    private String temp;


    //TODO
}
