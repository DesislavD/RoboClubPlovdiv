package com.example.RoboClubPlovdiv.services;

import com.example.RoboClubPlovdiv.models.Article;
import com.example.RoboClubPlovdiv.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService extends BaseService<Article> {
    @Autowired
    private ArticleRepo articleRepo;

    @Override
    protected JpaRepository<Article, Long> getRepo() {
        return articleRepo;
    }
}
