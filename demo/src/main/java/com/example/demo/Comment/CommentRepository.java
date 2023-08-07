package com.example.demo.Comment;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CommentRepository
        extends JpaRepository<CommentUser, Long> {
    // @Query("SELECT c FROM comment c WHERE c.email = ?1")
    // Optional<Comment> findCommentByEmail(String email);
}
