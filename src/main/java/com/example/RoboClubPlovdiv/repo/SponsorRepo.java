package com.example.RoboClubPlovdiv.repo;

import com.example.RoboClubPlovdiv.models.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepo extends JpaRepository<Sponsor,Long> {
}
