package com.example.RoboClubPlovdiv.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectDTO extends BaseDTO{

    private String name;
    private double price;
    private String description;


}
