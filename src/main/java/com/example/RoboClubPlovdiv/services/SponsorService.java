package com.example.RoboClubPlovdiv.services;

import com.example.RoboClubPlovdiv.models.Sponsor;
import com.example.RoboClubPlovdiv.repo.SponsorRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SponsorService extends  BaseService<Sponsor> {

    private SponsorRepo sponsorRepo;

    @Override
    protected JpaRepository<Sponsor, Long> getRepo() {
        return sponsorRepo;
    }
}
