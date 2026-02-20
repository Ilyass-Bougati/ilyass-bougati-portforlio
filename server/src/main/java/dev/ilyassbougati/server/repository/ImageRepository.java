package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageRepository extends JpaRepository<Image, UUID> {
    <T> T findImageById(UUID id, Class<T> type);
}