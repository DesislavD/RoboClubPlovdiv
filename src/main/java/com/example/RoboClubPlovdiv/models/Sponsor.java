package com.example.RoboClubPlovdiv.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SPONSORS")
public class Sponsor extends MainModel{


    @Column(nullable = false)
    private String name;
    @Column(nullable = false, length = 60, unique = true)
    private String email;
    @Column(name = "IS_ACTIVE")
    private boolean isActive = true;
    @Column(length = 30)
    private String phone;
    @Column
    private String address;
}
