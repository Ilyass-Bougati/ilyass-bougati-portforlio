package dev.ilyassbougati.server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Collaborator {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    // NOTE : This might be removed later because we can extract the username from the link
    @NotEmpty
    private String githubUsername;

    // TODO : Custom validation for this being a url
    @NotEmpty
    private String githubLink;

    // TODO : Custom validation for this being a url
    @NotEmpty
    private String websiteLink;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
