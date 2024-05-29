package org.projectx.entity.data;

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
    @ManyToOne
    private Project project;

}
