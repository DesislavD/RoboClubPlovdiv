package com.example.RoboClubPlovdiv.repo;

import com.example.RoboClubPlovdiv.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event,Long> {
}
