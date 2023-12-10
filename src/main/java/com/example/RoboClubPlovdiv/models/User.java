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
@Table(name = "USERS")
public class User extends MainModel {

    @Column(name = "First Name",nullable = false, length = 30)
    private String fName;
    @Column(name = "Last Name",nullable = false, length = 30)
    private String lName;
    @Column(name = "password",nullable = false, length = 256)
    private String password;
    @Column(name = "email",nullable = false, length = 60, unique = true)
    private String email;

    @Column(name = "ROLE_ID")
    private Role role;
    @Column(name = "IS_ACTIVE")
    private boolean isActive = true;
    @Column(name = "LAST_LOGGED_AT")
    private LocalDateTime lastLoggedAt;
    @Column(name ="phone",length = 30,unique = true)
    private String phone;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "owner")
    private Set<Article> articles;
}
