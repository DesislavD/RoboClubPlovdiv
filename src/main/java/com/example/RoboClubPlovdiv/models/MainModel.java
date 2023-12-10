package com.example.RoboClubPlovdiv.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class MainModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "DELETED_AT")
    private LocalDateTime deletedAt;
}
