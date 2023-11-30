package com.example.RoboClubPlovdiv.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class EventDTO extends BaseDTO{

    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String description;
}
