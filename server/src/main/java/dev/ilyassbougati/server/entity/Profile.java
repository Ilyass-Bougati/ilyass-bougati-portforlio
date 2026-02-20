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

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
