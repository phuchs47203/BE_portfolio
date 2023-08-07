package com.example.demo.Comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins = "http://localhost:3000") link website front end
@CrossOrigin(origins = "https://new-portfolio-rose-seven.vercel.app/")

@RestController
@RequestMapping(path = "api/v1/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<CommentUser> getComment() {
        return commentService.getComment();
    }

    @PostMapping
    public @ResponseBody String addComment(@RequestBody CommentUser comment) {
        commentService.addComment(comment);
        return "Inserted";
    }
}
