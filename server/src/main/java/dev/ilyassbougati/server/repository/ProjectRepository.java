package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectRepository extends JpaRepository<Project, UUID> {
    <T> T findProjectById(UUID id, Class<T> type);
}