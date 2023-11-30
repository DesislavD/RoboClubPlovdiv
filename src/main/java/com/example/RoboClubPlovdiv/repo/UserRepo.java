package com.example.RoboClubPlovdiv.repo;

import com.example.RoboClubPlovdiv.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
