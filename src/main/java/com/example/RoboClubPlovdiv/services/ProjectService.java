package com.example.RoboClubPlovdiv.services;


import com.example.RoboClubPlovdiv.models.Project;
import com.example.RoboClubPlovdiv.repo.ProjectRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends BaseService<Project> {


    private ProjectRepo projectRepo;

    @Override
    protected JpaRepository<Project, Long> getRepo() {
        return projectRepo;
    }
}
