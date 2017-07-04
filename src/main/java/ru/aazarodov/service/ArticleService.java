package ru.aazarodov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aazarodov.dao.ArticleRepository;
import ru.aazarodov.model.Article;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;

    public void save(Article article) {
        repository.save(article);

        System.out.println(article);
    }
}
