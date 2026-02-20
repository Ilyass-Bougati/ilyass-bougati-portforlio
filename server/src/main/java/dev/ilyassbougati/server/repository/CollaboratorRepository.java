package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, UUID> {
    <T> T findCollaboratorById(UUID id, Class<T> type);
}