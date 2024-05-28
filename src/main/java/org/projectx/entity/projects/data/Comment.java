package org.projectx.entity.projects.data;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "project_id")
    private Long projectId;
    private Long userId;

    public Comment() {
    }

    public Comment(Long projectId, Long userId) {
        this.projectId = projectId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
