package org.projectx.entity.projects;

import jakarta.persistence.*;
import org.projectx.entity.projects.data.Comment;
import org.projectx.entity.projects.data.Photo;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 120, nullable = false)
    private String header;
    @Column(length = 1000)
    private String description;
    @Column(length = 200)
    private String shortDescription;
    @OneToMany(mappedBy = "photo", cascade = CascadeType.ALL)
    private Set<Photo> projectSet;
    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    private Set<Comment> commentSet;
    private Long rating;
    private Long designerId;

    public Project() {
    }

    public Project(String header, String description, String shortDescription, Set<Photo> projectSet, Set<Comment> commentSet, Long rating, Long designerId) {
        this.header = header;
        this.description = description;
        this.shortDescription = shortDescription;
        this.projectSet = projectSet;
        this.commentSet = commentSet;
        this.rating = rating;
        this.designerId = designerId;
    }

    public Long getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Set<Photo> getProjectSet() {
        return projectSet;
    }

    public void setProjectSet(Set<Photo> projectSet) {
        this.projectSet = projectSet;
    }

    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Long getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Long designerId) {
        this.designerId = designerId;
    }
}
