package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, UUID> {
    <T> T findArticleById(UUID id, Class<T> type);
}