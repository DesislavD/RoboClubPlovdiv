package com.example.RoboClubPlovdiv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ARTICLES")

public class Article  extends MainModel{

    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION", length = 3000)
    private String description;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User owner;
}
