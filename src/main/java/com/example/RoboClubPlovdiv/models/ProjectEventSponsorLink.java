package com.example.RoboClubPlovdiv.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ProjectEventSponsorLink")
public class ProjectEventSponsorLink  extends MainModel{

    /**
     * Link Tables "Events", "Sponsors", "Projects" to create ManyToMany relationship
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event events;

    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsors;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project projects;


}
