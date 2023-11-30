package com.example.RoboClubPlovdiv.repo;

import com.example.RoboClubPlovdiv.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {
}
