package org.projectx.entity.projects;

import jakarta.persistence.*;
import org.projectx.entity.projects.data.Photo;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 120)
    private String header;
    private String description;
    @OneToMany
    private Set<Photo> projectSet;
    @Column(length = 5)
    private Long rating;
    private Long designerId;





}
