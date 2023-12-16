package com.example.project.violearnback.repositories;

import com.example.project.violearnback.entities.Post;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByUserId(Long userId);

    Page<Post> findAllByUserEmail(String email, Pageable pageable);

    @NotNull Page<Post> findAll(@NotNull Pageable pageable);

    void deleteAllByUserEmail(String email);
}
