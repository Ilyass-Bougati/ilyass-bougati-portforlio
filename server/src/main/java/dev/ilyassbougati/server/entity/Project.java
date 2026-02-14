package dev.ilyassbougati.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // TODO : add a banner Id

    @NotEmpty
    private String title;

    @NotEmpty
    @Column(columnDefinition = "TEXT")
    private String description;

    @NotEmpty
    private String githubLink;

    @NotNull
    private Boolean githubPrivate;

    @NotNull
    private LocalDateTime startingDate;

    private LocalDateTime finishingDate = null;

    @NotNull
    private Boolean unfinished;

    @NotEmpty
    @Column(unique = true)
    private String slug;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
