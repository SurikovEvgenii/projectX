package org.projectx.entity.projects.data;

import jakarta.persistence.*;
import org.projectx.entity.projects.Project;

import java.util.List;
import java.util.Objects;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Long projectId;

    public Photo() {
    }

    public Photo(String url, Long projectId) {
        this.url = url;
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
