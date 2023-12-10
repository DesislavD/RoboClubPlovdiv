package com.example.RoboClubPlovdiv.services;


import com.example.RoboClubPlovdiv.models.Event;
import com.example.RoboClubPlovdiv.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService extends BaseService <Event> {


    @Autowired
    private EventRepo eventRepo;

    @Override
    protected JpaRepository<Event, Long> getRepo() {
        return  eventRepo;
    }
}
