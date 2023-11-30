package com.example.RoboClubPlovdiv.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO extends BaseDTO{


    private String fName;
    private String lName;
    private String password;
    private String email;
    private boolean isActive = true;
    private LocalDateTime createdAt;
    private LocalDateTime lastLoggedAt;
    private String phone;
    private String address;
}
