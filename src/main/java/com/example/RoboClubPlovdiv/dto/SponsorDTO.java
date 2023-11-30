package com.example.RoboClubPlovdiv.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SponsorDTO extends BaseDTO{

    private String name;
    private String email;
    private boolean isActive = true;
    private String phone;
    private String address;
}
