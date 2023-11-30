package com.example.RoboClubPlovdiv.dto;

import com.example.RoboClubPlovdiv.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArticleDTO extends BaseDTO{


    private String description;
    private String title;
    private long ownerId;
}
