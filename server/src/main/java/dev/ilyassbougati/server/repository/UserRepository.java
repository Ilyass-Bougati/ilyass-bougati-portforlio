package dev.ilyassbougati.server.repository;

import dev.ilyassbougati.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    <T> T findUserById(UUID id, Class<T> type);
}