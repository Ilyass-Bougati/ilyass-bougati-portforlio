package dev.ilyassbougati.server.entity;

import dev.ilyassbougati.server.enums.ArticleStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // TODO: add banner image

    @NotEmpty
    @Column(unique = true)
    private String slug;

    @NotEmpty
    private String title;

    @NotNull
    private Integer readTime;

    @NotEmpty
    @Column(columnDefinition = "TEXT")
    private String content;

    @NotNull
    private ArticleStatus status;

    private LocalDateTime publishedAt;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
