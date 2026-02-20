package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, UUID> {
    <T> T findProfileById(UUID id, Class<T> type);
}