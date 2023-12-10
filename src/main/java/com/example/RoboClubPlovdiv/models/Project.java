package com.example.RoboClubPlovdiv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

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


//    //TODO
//    @OneToMany(mappedBy = "projects")
//    private Set<Project> projects;




}
