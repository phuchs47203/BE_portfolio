package com.example.demo.Comment;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<CommentUser> getComment() {
        return commentRepository.findAll();
    }

    public void addComment(CommentUser comment) {
        commentRepository.save(comment);
    }
}
