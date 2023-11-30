package com.example.RoboClubPlovdiv.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

    @Column(nullable = false, length = 30)
    private String fName;
    @Column(nullable = false, length = 30)
    private String lName;
    @Column(nullable = false, length = 32)
    private String password;
    @Column(nullable = false, length = 60, unique = true)
    private String email;

    private Role role;
    @Column(name = "IS_ACTIVE")
    private boolean isActive = true;
    @Column(name = "LAST_LOGGED_AT")
    private LocalDateTime lastLoggedAt;
    @Column(length = 30)
    private String phone;
    @Column
    private String address;
    @OneToMany(mappedBy = "owner")
    private Set<Article> articles;
}
