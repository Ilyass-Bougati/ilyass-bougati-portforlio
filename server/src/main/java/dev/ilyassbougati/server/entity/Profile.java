package dev.ilyassbougati.server.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // TODO : Add avatar which is an image

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    // TODO : Add custom validator for phone number
    @NotEmpty
    private String phoneNumber;

    @NotEmpty
    @Email
    private String email;

    // NOTE : This might be removed later because we can extract the username from the link
    @NotEmpty
    private String githubUsername;

    // TODO : Custom validation for this being a url
    @NotEmpty
    private String githubLink;

    // FIXME : how are we gonna handle this being in multiple languages? Possible embed it? or store it as json?
    // TODO : Investigate using @Lob instead of columnDefinition
    @NotEmpty
    @Column(columnDefinition = "TEXT")
    private String tagLine;

    @NotEmpty
    @Column(columnDefinition = "TEXT")
    private String shortBio;

    @NotEmpty
    @Column(columnDefinition = "TEXT")
    private String longBio;

    @NotEmpty
    private String resumerUrl;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
