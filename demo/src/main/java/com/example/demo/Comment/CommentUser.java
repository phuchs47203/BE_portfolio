package com.example.demo.Comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class CommentUser {

    @Id
    @SequenceGenerator(name = "usercomment_sequence", sequenceName = "usercomment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usercomment_sequence")

    private Long id;
    private String email;
    private String fullname;
    private String projectName;
    private String commentofuser;

    public CommentUser() {

    }

    public CommentUser(Long id, String email, String fullname, String projectName, String commentofuser) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.projectName = projectName;
        this.commentofuser = commentofuser;
    }

    public CommentUser(String email, String fullname, String projectName, String commentofuser) {
        this.email = email;
        this.fullname = fullname;
        this.projectName = projectName;
        this.commentofuser = commentofuser;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CommentUser [id=" + id + ", email=" + email + ", fullname=" + fullname + ", projectName=" + projectName
                + ", commentofuser=" + commentofuser + "]";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setCommentofuser(String commentofuser) {
        this.commentofuser = commentofuser;
    }

    public String getFullname() {
        return fullname;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getCommentofuser() {
        return commentofuser;
    }

}
